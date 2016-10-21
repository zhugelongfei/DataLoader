@echo off

set files=char.sc.thrift
set cur_path=%cd%

rem 生成java代码
rd /s /q gen-java
echo 开始生成java代码
FOR /R ./thrift %%e IN (%files%) DO (
  echo gen java %%e
  call "lib/thrift-0.9.0.exe" --gen java %%e
)

cd %cur_path%/lib
call msg_helper.bat java "../gen-java/" "../gen-java/com/ling9527/music/common/msg/auto"

cd %cur_path%
cd ..
echo %cd%
call "lib/iconv.bat"
echo java代码生成完毕


rem 生成c#代码
echo 开始生成c#代码
cd /d %~dp0
rd /s /q gen-csharp

FOR /R ./thrift %%e IN (%files%) DO (
  echo gen c# %%e
  call "lib/thrift-0.9.0.exe" --gen csharp %%e
)

cd %cur_path%/lib
call msg_helper.bat csharp "../gen-csharp/" "../gen-csharp/MusicCodec" 

cd /d %~dp0
MakeThriftFile.exe
echo c#代码生成完毕

pause