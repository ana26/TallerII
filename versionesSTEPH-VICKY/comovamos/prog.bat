@echo off
Taskkill /f /IM winword.exe
c:
cd c:\comovamos
mkdir c:\comovamos\versiones
copy comovamos.txt c:\comovamos\versiones\*.* /y
cd C:\Users\kavi\Documents
copy comovamos2.txt c:\comovamos\
cd c:\comovamos
del comovamos.txt
"C:\Program Files\Microsoft Office\Office14\WINWORD.EXE"
pause