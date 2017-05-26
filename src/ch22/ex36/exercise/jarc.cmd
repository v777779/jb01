rem .\src\ch22\ex36\exercise\jarc.cmd
cd .\src\ch22\ex36\exercise\
rmdir /q /s ch22
del /q *.jar
mkdir ch22\ex36\exercise\jbean
copy ..\..\..\..\out\production\jb01\ch22\ex36\exercise\jbean\*.class  .\ch22\ex36\exercise\jbean
jar cvfm BangBean4.jar  BangBean4.mf ch22/ex36/exercise/jbean

rmdir /q /s ch22

cd ..\..\..\..