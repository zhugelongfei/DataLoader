@ECHO OFF

set cur_path=%cd%

cd %cur_path%/gen-java
FOR /R %%F IN (*.java) DO (
	echo "convert %%~nxF to utf-8 format"
	%cur_path%/lib/iconv.exe -f gbk -t UTF-8 %%F > %%F.utf8
	move %%F.utf8 %%F >nul
)

rem cd %cur_path%/gen-csharp
rem FOR /R %%F IN (*.cs) DO (
rem 	echo "convert %%~nxF to utf-8 format"
rem 	%cur_path%/lib/iconv.exe -f gbk -t UTF-8 %%F > %%F.utf8
rem 	move %%F.utf8 %%F >nul
rem )
