// ExcelRegShlExt.h : CExcelRegShlExt ������

#pragma once
#include "resource.h"       // ������
#include "atlcom.h"
#include <comdef.h>
#include <shlobj.h>
#include <string>
using namespace std;

#include "LoaderRegKey_i.h"

#if defined(_WIN32_WCE) && !defined(_CE_DCOM) && !defined(_CE_ALLOW_SINGLE_THREADED_OBJECTS_IN_MTA)
#error "Windows CE ƽ̨(�粻�ṩ��ȫ DCOM ֧�ֵ� Windows Mobile ƽ̨)���޷���ȷ֧�ֵ��߳� COM ���󡣶��� _CE_ALLOW_SINGLE_THREADED_OBJECTS_IN_MTA ��ǿ�� ATL ֧�ִ������߳� COM ����ʵ�ֲ�����ʹ���䵥�߳� COM ����ʵ�֡�rgs �ļ��е��߳�ģ���ѱ�����Ϊ��Free����ԭ���Ǹ�ģ���Ƿ� DCOM Windows CE ƽ̨֧�ֵ�Ψһ�߳�ģ�͡�"
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
