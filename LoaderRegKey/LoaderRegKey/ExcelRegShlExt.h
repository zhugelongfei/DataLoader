// ExcelRegShlExt.h : CExcelRegShlExt 的声明

#pragma once
#include "resource.h"       // 主符号
#include "atlcom.h"
#include <comdef.h>
#include <shlobj.h>
#include <string>
using namespace std;

#include "LoaderRegKey_i.h"

#if defined(_WIN32_WCE) && !defined(_CE_DCOM) && !defined(_CE_ALLOW_SINGLE_THREADED_OBJECTS_IN_MTA)
#error "Windows CE 平台(如不提供完全 DCOM 支持的 Windows Mobile 平台)上无法正确支持单线程 COM 对象。定义 _CE_ALLOW_SINGLE_THREADED_OBJECTS_IN_MTA 可强制 ATL 支持创建单线程 COM 对象实现并允许使用其单线程 COM 对象实现。rgs 文件中的线程模型已被设置为“Free”，原因是该模型是非 DCOM Windows CE 平台支持的唯一线程模型。"
#endif

using namespace ATL;

// CExcelRegShlExt

class ATL_NO_VTABLE CExcelRegShlExt :
	public CComObjectRootEx<CComSingleThreadModel>,
	public CComCoClass<CExcelRegShlExt, &CLSID_ExcelRegShlExt>,
	public IDispatchImpl<IExcelRegShlExt, &IID_IExcelRegShlExt, &LIBID_LoaderRegKeyLib, /*wMajor =*/ 1, /*wMinor =*/ 0>,
	public IShellExtInit,
	public IContextMenu
{
public:
	CExcelRegShlExt()
	{
		structBmp = LoadBitmap(_AtlBaseModule.GetModuleInstance(), MAKEINTRESOURCE(IDB_BITMAP_STRUCT));
		dataBmp = LoadBitmap(_AtlBaseModule.GetModuleInstance(), MAKEINTRESOURCE(IDB_BITMAP_DATABASE));
		longBmp = LoadBitmap(_AtlBaseModule.GetModuleInstance(), MAKEINTRESOURCE(IDB_BITMAP_LONG));
	}

DECLARE_REGISTRY_RESOURCEID(IDR_EXCELREGSHLEXT)


BEGIN_COM_MAP(CExcelRegShlExt)
	COM_INTERFACE_ENTRY(IExcelRegShlExt)
	COM_INTERFACE_ENTRY(IDispatch)
	COM_INTERFACE_ENTRY(IShellExtInit)
	COM_INTERFACE_ENTRY(IContextMenu)
END_COM_MAP()

	DECLARE_PROTECT_FINAL_CONSTRUCT()

	HRESULT FinalConstruct()
	{
		return S_OK;
	}

	void FinalRelease() {}

	STDMETHOD(Initialize)(PCIDLIST_ABSOLUTE pidlFolder, IDataObject *pdtobj, HKEY hkeyProgID);

	STDMETHOD(QueryContextMenu)(HMENU hmenu, UINT indexMenu, UINT idCmdFirst, UINT idCmdLast, UINT uFlags);
	STDMETHOD(GetCommandString)(UINT_PTR idCmd, UINT uType, UINT *pReserved, LPSTR szName, UINT cchMax);
	STDMETHOD(InvokeCommand)(CMINVOKECOMMANDINFO *pici);

	void StartLoaderExe(wstring str, CMINVOKECOMMANDINFO * pCmdInfo);

	bool CheckExIsXlsx(TCHAR* str);

protected:
	HBITMAP structBmp;
	HBITMAP dataBmp;
	HBITMAP longBmp;
	string_list m_lstFiles;
	TCHAR m_szDir[MAX_PATH];
};

OBJECT_ENTRY_AUTO(__uuidof(ExcelRegShlExt), CExcelRegShlExt)
