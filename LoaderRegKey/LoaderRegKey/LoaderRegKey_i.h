

/* this ALWAYS GENERATED file contains the definitions for the interfaces */


 /* File created by MIDL compiler version 8.00.0603 */
/* at Thu Apr 06 16:55:51 2017
 */
/* Compiler settings for LoaderRegKey.idl:
    Oicf, W1, Zp8, env=Win64 (32b run), target_arch=AMD64 8.00.0603 
    protocol : dce , ms_ext, c_ext, robust
    error checks: allocation ref bounds_check enum stub_data 
    VC __declspec() decoration level: 
         __declspec(uuid()), __declspec(selectany), __declspec(novtable)
         DECLSPEC_UUID(), MIDL_INTERFACE()
*/
/* @@MIDL_FILE_HEADING(  ) */

#pragma warning( disable: 4049 )  /* more than 64k source lines */


/* verify that the <rpcndr.h> version is high enough to compile this file*/
#ifndef __REQUIRED_RPCNDR_H_VERSION__
#define __REQUIRED_RPCNDR_H_VERSION__ 475
#endif

#include "rpc.h"
#include "rpcndr.h"

#ifndef __RPCNDR_H_VERSION__
#error this stub requires an updated version of <rpcndr.h>
#endif // __RPCNDR_H_VERSION__

#ifndef COM_NO_WINDOWS_H
#include "windows.h"
#include "ole2.h"
#endif /*COM_NO_WINDOWS_H*/

#ifndef __LoaderRegKey_i_h__
#define __LoaderRegKey_i_h__

#if defined(_MSC_VER) && (_MSC_VER >= 1020)
#pragma once
#endif

/* Forward Declarations */ 

#ifndef __IExcelRegShlExt_FWD_DEFINED__
#define __IExcelRegShlExt_FWD_DEFINED__
typedef interface IExcelRegShlExt IExcelRegShlExt;

#endif 	/* __IExcelRegShlExt_FWD_DEFINED__ */


#ifndef __ExcelRegShlExt_FWD_DEFINED__
#define __ExcelRegShlExt_FWD_DEFINED__

#ifdef __cplusplus
typedef class ExcelRegShlExt ExcelRegShlExt;
#else
typedef struct ExcelRegShlExt ExcelRegShlExt;
#endif /* __cplusplus */

#endif 	/* __ExcelRegShlExt_FWD_DEFINED__ */


/* header files for imported files */
#include "oaidl.h"
#include "ocidl.h"

#ifdef __cplusplus
extern "C"{
#endif 


#ifndef __IExcelRegShlExt_INTERFACE_DEFINED__
#define __IExcelRegShlExt_INTERFACE_DEFINED__

/* interface IExcelRegShlExt */
/* [unique][nonextensible][dual][uuid][object] */ 


EXTERN_C const IID IID_IExcelRegShlExt;

#if defined(__cplusplus) && !defined(CINTERFACE)
    
    MIDL_INTERFACE("49148948-C438-4886-91FB-F22BF566C6EA")
    IExcelRegShlExt : public IDispatch
    {
    public:
    };
    
    
#else 	/* C style interface */

    typedef struct IExcelRegShlExtVtbl
    {
        BEGIN_INTERFACE
        
        HRESULT ( STDMETHODCALLTYPE *QueryInterface )( 
            IExcelRegShlExt * This,
            /* [in] */ REFIID riid,
            /* [annotation][iid_is][out] */ 
            _COM_Outptr_  void **ppvObject);
        
        ULONG ( STDMETHODCALLTYPE *AddRef )( 
            IExcelRegShlExt * This);
        
        ULONG ( STDMETHODCALLTYPE *Release )( 
            IExcelRegShlExt * This);
        
        HRESULT ( STDMETHODCALLTYPE *GetTypeInfoCount )( 
            IExcelRegShlExt * This,
            /* [out] */ UINT *pctinfo);
        
        HRESULT ( STDMETHODCALLTYPE *GetTypeInfo )( 
            IExcelRegShlExt * This,
            /* [in] */ UINT iTInfo,
            /* [in] */ LCID lcid,
            /* [out] */ ITypeInfo **ppTInfo);
        
        HRESULT ( STDMETHODCALLTYPE *GetIDsOfNames )( 
            IExcelRegShlExt * This,
            /* [in] */ REFIID riid,
            /* [size_is][in] */ LPOLESTR *rgszNames,
            /* [range][in] */ UINT cNames,
            /* [in] */ LCID lcid,
            /* [size_is][out] */ DISPID *rgDispId);
        
        /* [local] */ HRESULT ( STDMETHODCALLTYPE *Invoke )( 
            IExcelRegShlExt * This,
            /* [annotation][in] */ 
            _In_  DISPID dispIdMember,
            /* [annotation][in] */ 
            _In_  REFIID riid,
            /* [annotation][in] */ 
            _In_  LCID lcid,
            /* [annotation][in] */ 
            _In_  WORD wFlags,
            /* [annotation][out][in] */ 
            _In_  DISPPARAMS *pDispParams,
            /* [annotation][out] */ 
            _Out_opt_  VARIANT *pVarResult,
            /* [annotation][out] */ 
            _Out_opt_  EXCEPINFO *pExcepInfo,
            /* [annotation][out] */ 
            _Out_opt_  UINT *puArgErr);
        
        END_INTERFACE
    } IExcelRegShlExtVtbl;

    interface IExcelRegShlExt
    {
        CONST_VTBL struct IExcelRegShlExtVtbl *lpVtbl;
    };

    

#ifdef COBJMACROS


#define IExcelRegShlExt_QueryInterface(This,riid,ppvObject)	\
    ( (This)->lpVtbl -> QueryInterface(This,riid,ppvObject) ) 

#define IExcelRegShlExt_AddRef(This)	\
    ( (This)->lpVtbl -> AddRef(This) ) 

#define IExcelRegShlExt_Release(This)	\
    ( (This)->lpVtbl -> Release(This) ) 


#define IExcelRegShlExt_GetTypeInfoCount(This,pctinfo)	\
    ( (This)->lpVtbl -> GetTypeInfoCount(This,pctinfo) ) 

#define IExcelRegShlExt_GetTypeInfo(This,iTInfo,lcid,ppTInfo)	\
    ( (This)->lpVtbl -> GetTypeInfo(This,iTInfo,lcid,ppTInfo) ) 

#define IExcelRegShlExt_GetIDsOfNames(This,riid,rgszNames,cNames,lcid,rgDispId)	\
    ( (This)->lpVtbl -> GetIDsOfNames(This,riid,rgszNames,cNames,lcid,rgDispId) ) 

#define IExcelRegShlExt_Invoke(This,dispIdMember,riid,lcid,wFlags,pDispParams,pVarResult,pExcepInfo,puArgErr)	\
    ( (This)->lpVtbl -> Invoke(This,dispIdMember,riid,lcid,wFlags,pDispParams,pVarResult,pExcepInfo,puArgErr) ) 


#endif /* COBJMACROS */


#endif 	/* C style interface */




#endif 	/* __IExcelRegShlExt_INTERFACE_DEFINED__ */



#ifndef __LoaderRegKeyLib_LIBRARY_DEFINED__
#define __LoaderRegKeyLib_LIBRARY_DEFINED__

/* library LoaderRegKeyLib */
/* [version][uuid] */ 


EXTERN_C const IID LIBID_LoaderRegKeyLib;

EXTERN_C const CLSID CLSID_ExcelRegShlExt;

#ifdef __cplusplus

class DECLSPEC_UUID("03F1F93A-290C-4DCD-99BD-B4F7685FD873")
ExcelRegShlExt;
#endif
#endif /* __LoaderRegKeyLib_LIBRARY_DEFINED__ */

/* Additional Prototypes for ALL interfaces */

/* end of Additional Prototypes */

#ifdef __cplusplus
}
#endif

#endif


