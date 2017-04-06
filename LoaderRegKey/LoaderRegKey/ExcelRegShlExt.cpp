// ExcelRegShlExt.cpp : CExcelRegShlExt 的实现

#include "stdafx.h"
#include "ExcelRegShlExt.h"
#include <windows.h>
#include <string>
#include <direct.h>
using namespace std;

// CExcelRegShlExt

STDMETHODIMP CExcelRegShlExt::Initialize(PCIDLIST_ABSOLUTE pidlFolder, IDataObject* pDataObj, HKEY hProgID)
{
	TCHAR szFile[MAX_PATH];
	UINT uNumFiles;
	HDROP hDrop;
	FORMATETC etc = { CF_HDROP,nullptr,DVASPECT_CONTENT,-1,TYMED_HGLOBAL };
	STGMEDIUM stg = { TYMED_HGLOBAL };
	HINSTANCE hInst;
	bool bChangeDir = false;
	HRESULT(STDAPICALLTYPE* pfn)();

	// 从数据对象中读取文件列表. 他们存储在HDROP 格式中
	// 因此，取得 HDROP 句柄，并使用拖放API
	if (FAILED(pDataObj->GetData(&etc, &stg)))
		return E_INVALIDARG;

	//取得HDROP 句柄.
	hDrop = (HDROP)GlobalLock(stg.hGlobal);
	if (hDrop == NULL)
	{
		ReleaseStgMedium(&stg);
		return E_INVALIDARG;
	}

	// 检查在该操作中有几个文件被选择.
	uNumFiles = DragQueryFile(hDrop, 0xFFFFFFFF, NULL, 0);

	for (size_t index = 0; index < uNumFiles; index++)
	{
		//取得下一个文件名.
		if (0 == DragQueryFile(hDrop, index, szFile, MAX_PATH))
			continue;

		if (CheckExIsXlsx(szFile))
			m_lstFiles.push_back(szFile);
	} // end for 

	// 释放资源.
	GlobalUnlock(stg.hGlobal);
	ReleaseStgMedium(&stg);

	// 如果我们找到可以操作的文件, 返回 S_OK.
	// 否则,返回E_INVALIDARG，我们的代码就不会再被右击事件调用。
	return (m_lstFiles.size() > 0) ? S_OK : E_INVALIDARG;
}

STDMETHODIMP CExcelRegShlExt::QueryContextMenu(HMENU hmenu, UINT indexMenu, UINT idCmdFirst, UINT idCmdLast, UINT uFlags)
{
	// 如果 CMF_DEFAULTONLY 标志被设置我们不作任何操作. 
	if (uFlags & CMF_DEFAULTONLY)
	{
		return MAKE_HRESULT(SEVERITY_SUCCESS, FACILITY_NULL, 0);
	}

	//插入分隔符
	InsertMenu(hmenu, indexMenu, MF_SEPARATOR | MF_BYPOSITION, 0, NULL);
	indexMenu++;

	//子菜单的构造
	HMENU subMenu = CreateMenu();
	if (subMenu)
	{
		int subIndex = 0;
		//添加Register项.
		InsertMenu(subMenu, subIndex, MF_STRING | MF_BYPOSITION, idCmdFirst++, _T("Build Struct"));

		//为生成结构项设置位图
		if (structBmp != NULL)
		{
			SetMenuItemBitmaps(subMenu, subIndex, MF_BYPOSITION, structBmp, NULL);
		}

		++subIndex;

		//添加UnRegister项.
		InsertMenu(subMenu, subIndex, MF_STRING | MF_BYPOSITION, idCmdFirst++, _T("Build Data"));

		//为生成数据项设置位图
		if (dataBmp != NULL)
		{
			SetMenuItemBitmaps(subMenu, subIndex, MF_BYPOSITION, dataBmp, NULL);
		}
	}

	//插入子菜单
	InsertMenu(hmenu, indexMenu, MF_STRING | MF_POPUP | MF_BYPOSITION, (UINT_PTR)subMenu, _T("Loader"));

	//为loader项设置位图
	if (longBmp != NULL)
	{
		SetMenuItemBitmaps(hmenu, indexMenu, MF_BYPOSITION, longBmp, NULL);
	}
	indexMenu++;

	//插入分隔符
	InsertMenu(hmenu, indexMenu, MF_SEPARATOR | MF_BYPOSITION, 0, NULL);
	indexMenu++;

	return MAKE_HRESULT(SEVERITY_SUCCESS, FACILITY_NULL, 3);
}

STDMETHODIMP CExcelRegShlExt::GetCommandString(UINT_PTR idCmd, UINT uType, UINT * pReserved, LPSTR szName, UINT cchMax)
{
	LPCTSTR szPrompt;
	USES_CONVERSION;
	if (uType & GCS_HELPTEXT)
	{
		switch (idCmd)
		{
			case 0:
				szPrompt = _T("Rebuild struct and data");
				break;
			case 1:
				szPrompt = _T("Only rebuild data(fast)");
				break;
			default:
				return E_INVALIDARG;
		}

		// 拷贝帮助字符串到提供的缓冲区中. 如果Shell需要Unicode字符串，我们需要转化szName 到 LPCWSTR.
		if (uType & GCS_UNICODE)
		{
			lstrcpynW((LPWSTR)szName, T2CW(szPrompt), cchMax);
		}
		else
		{
			lstrcpynA(szName, T2CA(szPrompt), cchMax);
		}
	}

	return S_OK;
}

STDMETHODIMP CExcelRegShlExt::InvokeCommand(CMINVOKECOMMANDINFO * pCmdInfo)
{
	// 如果 lpVerb 指向一字符串, 忽略此次调用. 
	if (HIWORD(pCmdInfo->lpVerb) != 0)
		return E_INVALIDARG;

	switch (LOWORD(pCmdInfo->lpVerb))
	{
		case 0:
		{
			wstring str(_T(""));

			for (string_list::iterator it = m_lstFiles.begin(); it != m_lstFiles.end(); it++)
			{
				str += _T(" ");
				str += wstring(it->c_str());
			}

			StartLoaderExe(str, pCmdInfo);

			return S_OK;
		}
		case 1:
		{
			wstring str(_T(" /d"));

			for (string_list::iterator it = m_lstFiles.begin(); it != m_lstFiles.end(); it++)
			{
				str += _T(" ");
				str += wstring(it->c_str());
			}

			StartLoaderExe(str, pCmdInfo);

			return S_OK;
		}
		default:
			return E_INVALIDARG;
	}

	return E_INVALIDARG;
}

void CExcelRegShlExt::StartLoaderExe(wstring str, CMINVOKECOMMANDINFO * pCmdInfo)
{
	STARTUPINFO StartInfo;
	PROCESS_INFORMATION pinfo;
	memset(&StartInfo, 0, sizeof(STARTUPINFO));
	StartInfo.cb = sizeof(STARTUPINFO);//设定结构的大小

	//找到注册表中保存的loader的路径
	HKEY key;
	TCHAR buf[MAX_PATH] = { '\0' };
	if (RegOpenKeyEx(HKEY_CLASSES_ROOT, NULL, NULL, KEY_ALL_ACCESS, &key) == ERROR_SUCCESS)
	{
		DWORD bufSize = sizeof(buf);
		DWORD type = REG_SZ;
		RegGetValue(key, _T("*\\shellex\\ContextMenuHandlers\\LongFeiLoader\\"),
			_T("path"), RRF_RT_ANY, &type, (LPBYTE)buf, &bufSize);

		RegCloseKey(HKEY_LOCAL_MACHINE);
	}

	if (CreateProcess(
		buf,
		(LPWSTR)str.c_str(),        //参数（当exeName为NULL时，可将命令放入参数前）
		NULL,                     //使用默认进程安全属性
		NULL,                     //使用默认线程安全属性
		FALSE,                   //句柄不继承
		NORMAL_PRIORITY_CLASS, //使用正常优先级
		NULL, //使用父进程的环境变量
		NULL, //指定工作目录
		&StartInfo, //子进程主窗口如何显示
		&pinfo)) //用于存放新进程的返回信息
	{
		WaitForSingleObject(pinfo.hProcess, INFINITE);
		CloseHandle(pinfo.hThread);
		CloseHandle(pinfo.hProcess);
	}
	else
	{
		MessageBox(pCmdInfo->hwnd, _T("The loader exe could not be started..."), _T("LoaderExcelReg"), MB_ICONINFORMATION);
	}
}

bool CExcelRegShlExt::CheckExIsXlsx(TCHAR * str)
{
	wstring strPath(str);

	int dotIndex = strPath.rfind('.');

	if (dotIndex == -1)
		return false;

	strPath = strPath.substr(dotIndex + 1, strPath.length() - dotIndex - 1);

	return strPath.compare(_T("xlsx")) == 0;
}
