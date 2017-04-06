// dllmain.h: 模块类的声明。

class CLoaderRegKeyModule : public ATL::CAtlDllModuleT< CLoaderRegKeyModule >
{
public :
	DECLARE_LIBID(LIBID_LoaderRegKeyLib)
	DECLARE_REGISTRY_APPID_RESOURCEID(IDR_LOADERREGKEY, "{59C4C360-E3AA-4CF6-BF6E-1E40AFDBA691}")
};

extern class CLoaderRegKeyModule _AtlModule;
