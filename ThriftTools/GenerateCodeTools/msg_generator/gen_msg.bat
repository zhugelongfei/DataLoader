@echo off


set cur_path=%cd%

rem ����java����
rd /s /q gen-java
echo ��ʼ����java����
FOR /R ./thrift %%e IN (*.thrift) DO (
  echo gen java %%e
  call "lib/thrift-0.9.0.exe" --gen java %%e
)

cd %cur_path%/lib
call msg_helper.bat java "../gen-java/" "../gen-java/com/ling9527/music/common/msg/auto"

cd %cur_path%
cd ..
echo %cd%
call "lib/iconv.bat"
echo java�����������


rem ����c#����
echo ��ʼ����c#����
cd /d %~dp0
rd /s /q gen-csharp

FOR /R ./thrift %%e IN (*.thrift) DO (
  echo gen c# %%e
  call "lib/thrift-0.9.0.exe" --gen csharp %%e
)

cd %cur_path%/lib
call msg_helper.bat csharp "../gen-csharp/" "../gen-csharp/MusicCodec" 

cd /d %~dp0
MakeThriftFile.exe
echo c#�����������

pause