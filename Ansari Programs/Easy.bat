@echo off


:hello

cd C:\Users\Duncan\Desktop\Computer Stuff\Java Programs\Seventh

dir

set /p variable=  Please set the name : 

javac %variable%.java

java %variable%

pause

cls

goto hello

