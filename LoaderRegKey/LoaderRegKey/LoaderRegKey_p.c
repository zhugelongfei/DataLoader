

/* this ALWAYS GENERATED file contains the proxy stub code */


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

#if defined(_M_AMD64)


#pragma warning( disable: 4049 )  /* more than 64k source lines */
#if _MSC_VER >= 1200
#pragma warning(push)
#endif

#pragma warning( disable: 4211 )  /* redefine extern to static */
#pragma warning( disable: 4232 )  /* dllimport identity*/
#pragma warning( disable: 4024 )  /* array to pointer mapping*/
#pragma warning( disable: 4152 )  /* function/data pointer conversion in expression */

#define USE_STUBLESS_PROXY


/* verify that the <rpcproxy.h> version is high enough to compile this file*/
#ifndef __REDQ_RPCPROXY_H_VERSION__
#define __REQUIRED_RPCPROXY_H_VERSION__ 475
#endif


#include "rpcproxy.h"
#ifndef __RPCPROXY_H_VERSION__
#error this stub requires an updated version of <rpcproxy.h>
#endif /* __RPCPROXY_H_VERSION__ */


#include "LoaderRegKey_i.h"

#define TYPE_FORMAT_STRING_SIZE   3                                 
#define PROC_FORMAT_STRING_SIZE   1                                 
#define EXPR_FORMAT_STRING_SIZE   1                                 
#define TRANSMIT_AS_TABLE_SIZE    0            
#define WIRE_MARSHAL_TABLE_SIZE   0            

typedef struct _LoaderRegKey_MIDL_TYPE_FORMAT_STRING
    {
    short          Pad;
    unsigned char  Format[ TYPE_FORMAT_STRING_SIZE ];
    } LoaderRegKey_MIDL_TYPE_FORMAT_STRING;

typedef struct _LoaderRegKey_MIDL_PROC_FORMAT_STRING
    {
    short          Pad;
    unsigned char  Format[ PROC_FORMAT_STRING_SIZE ];
    } LoaderRegKey_MIDL_PROC_FORMAT_STRING;

typedef struct _LoaderRegKey_MIDL_EXPR_FORMAT_STRING
    {
    long          Pad;
    unsigned char  Format[ EXPR_FORMAT_STRING_SIZE ];
    } LoaderRegKey_MIDL_EXPR_FORMAT_STRING;


static const RPC_SYNTAX_IDENTIFIER  _RpcTransferSyntax = 
{{0x8A885D04,0x1CEB,0x11C9,{0x9F,0xE8,0x08,0x00,0x2B,0x10,0x48,0x60}},{2,0}};


extern const LoaderRegKey_MIDL_TYPE_FORMAT_STRING LoaderRegKey__MIDL_TypeFormatString;
extern const LoaderRegKey_MIDL_PROC_FORMAT_STRING LoaderRegKey__MIDL_ProcFormatString;
extern const LoaderRegKey_MIDL_EXPR_FORMAT_STRING LoaderRegKey__MIDL_ExprFormatString;


extern const MIDL_STUB_DESC Object_StubDesc;


extern const MIDL_SERVER_INFO IExcelRegShlExt_ServerInfo;
extern const MIDL_STUBLESS_PROXY_INFO IExcelRegShlExt_ProxyInfo;



#if !defined(__RPC_WIN64__)
#error  Invalid build platform for this stub.
#endif

static const LoaderRegKey_MIDL_PROC_FORMAT_STRING LoaderRegKey__MIDL_ProcFormatString =
    {
        0,
        {

			0x0
        }
    };

static const LoaderRegKey_MIDL_TYPE_FORMAT_STRING LoaderRegKey__MIDL_TypeFormatString =
    {
        0,
        {
			NdrFcShort( 0x0 ),	/* 0 */

			0x0
        }
    };


/* Object interface: IUnknown, ver. 0.0,
   GUID={0x00000000,0x0000,0x0000,{0xC0,0x00,0x00,0x00,0x00,0x00,0x00,0x46}} */


/* Object interface: IDispatch, ver. 0.0,
   GUID={0x00020400,0x0000,0x0000,{0xC0,0x00,0x00,0x00,0x00,0x00,0x00,0x46}} */


/* Object interface: IExcelRegShlExt, ver. 0.0,
   GUID={0x49148948,0xC438,0x4886,{0x91,0xFB,0xF2,0x2B,0xF5,0x66,0xC6,0xEA}} */

#pragma code_seg(".orpc")
static const unsigned short IExcelRegShlExt_FormatStringOffsetTable[] =
    {
    (unsigned short) -1,
    (unsigned short) -1,
    (unsigned short) -1,
    (unsigned short) -1,
    0
    };

static const MIDL_STUBLESS_PROXY_INFO IExcelRegShlExt_ProxyInfo =
    {
    &Object_StubDesc,
    LoaderRegKey__MIDL_ProcFormatString.Format,
    &IExcelRegShlExt_FormatStringOffsetTable[-3],
    0,
    0,
    0
    };


static const MIDL_SERVER_INFO IExcelRegShlExt_ServerInfo = 
    {
    &Object_StubDesc,
    0,
    LoaderRegKey__MIDL_ProcFormatString.Format,
    &IExcelRegShlExt_FormatStringOffsetTable[-3],
    0,
    0,
    0,
    0};
CINTERFACE_PROXY_VTABLE(7) _IExcelRegShlExtProxyVtbl = 
{
    0,
    &IID_IExcelRegShlExt,
    IUnknown_QueryInterface_Proxy,
    IUnknown_AddRef_Proxy,
    IUnknown_Release_Proxy ,
    0 /* IDispatch::GetTypeInfoCount */ ,
    0 /* IDispatch::GetTypeInfo */ ,
    0 /* IDispatch::GetIDsOfNames */ ,
    0 /* IDispatch_Invoke_Proxy */
};


static const PRPC_STUB_FUNCTION IExcelRegShlExt_table[] =
{
    STUB_FORWARDING_FUNCTION,
    STUB_FORWARDING_FUNCTION,
    STUB_FORWARDING_FUNCTION,
    STUB_FORWARDING_FUNCTION
};

CInterfaceStubVtbl _IExcelRegShlExtStubVtbl =
{
    &IID_IExcelRegShlExt,
    &IExcelRegShlExt_ServerInfo,
    7,
    &IExcelRegShlExt_table[-3],
    CStdStubBuffer_DELEGATING_METHODS
};

static const MIDL_STUB_DESC Object_StubDesc = 
    {
    0,
    NdrOleAllocate,
    NdrOleFree,
    0,
    0,
    0,
    0,
    0,
    LoaderRegKey__MIDL_TypeFormatString.Format,
    1, /* -error bounds_check flag */
    0x50002, /* Ndr library version */
    0,
    0x800025b, /* MIDL Version 8.0.603 */
    0,
    0,
    0,  /* notify & notify_flag routine table */
    0x1, /* MIDL flag */
    0, /* cs routines */
    0,   /* proxy/server info */
    0
    };

const CInterfaceProxyVtbl * const _LoaderRegKey_ProxyVtblList[] = 
{
    ( CInterfaceProxyVtbl *) &_IExcelRegShlExtProxyVtbl,
    0
};

const CInterfaceStubVtbl * const _LoaderRegKey_StubVtblList[] = 
{
    ( CInterfaceStubVtbl *) &_IExcelRegShlExtStubVtbl,
    0
};

PCInterfaceName const _LoaderRegKey_InterfaceNamesList[] = 
{
    "IExcelRegShlExt",
    0
};

const IID *  const _LoaderRegKey_BaseIIDList[] = 
{
    &IID_IDispatch,
    0
};


#define _LoaderRegKey_CHECK_IID(n)	IID_GENERIC_CHECK_IID( _LoaderRegKey, pIID, n)

int __stdcall _LoaderRegKey_IID_Lookup( const IID * pIID, int * pIndex )
{
    
    if(!_LoaderRegKey_CHECK_IID(0))
        {
        *pIndex = 0;
        return 1;
        }

    return 0;
}

const ExtendedProxyFileInfo LoaderRegKey_ProxyFileInfo = 
{
    (PCInterfaceProxyVtblList *) & _LoaderRegKey_ProxyVtblList,
    (PCInterfaceStubVtblList *) & _LoaderRegKey_StubVtblList,
    (const PCInterfaceName * ) & _LoaderRegKey_InterfaceNamesList,
    (const IID ** ) & _LoaderRegKey_BaseIIDList,
    & _LoaderRegKey_IID_Lookup, 
    1,
    2,
    0, /* table of [async_uuid] interfaces */
    0, /* Filler1 */
    0, /* Filler2 */
    0  /* Filler3 */
};
#if _MSC_VER >= 1200
#pragma warning(pop)
#endif


#endif /* defined(_M_AMD64)*/

