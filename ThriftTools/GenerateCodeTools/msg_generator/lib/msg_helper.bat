@ECHO OFF

set cur_path=%cd%
set genType=%1
set inputDir=%2
set outDir=%3
set lib="lib/*"

java -cp %lib% com.ling9527.music.tools.msg.MsgUtilGenerator %genType% %inputDir% %outDir%