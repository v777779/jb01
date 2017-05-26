rem .\src\ch22\ex36\codeb\jarc.cmd
cd .\src\ch22\ex36\codeb\
rmdir /q /s ch22
del *.jar
mkdir ch22\ex36\codeb
copy ..\..\..\..\out\production\jb01\ch22\ex36\codeb\*.class  .\ch22\ex36\codeb\
jar cvfm BangBean3.jar  BangBean3.mf ch22/ex36/codeb

rmdir /q /s ch22

cd ..\..\..\..