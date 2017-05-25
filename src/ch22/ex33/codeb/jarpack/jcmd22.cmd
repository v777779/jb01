cd src\ch22\ex33\codeb\jarpack
jar cvf jnlpfilechooser.jar ch22\ex33\codeb/*.class

cd ..\..\..\..\..\
rmdir /q /s .\src\ch22\ex33\codeb\jarpack\ch22
rmdir /q /s  D:\temp2\_jarpack
mkdir D:\temp2\_jarpack
copy src\ch22\ex33\codeb\jarpack\* D:\temp2\_jarpack
del D:\temp2\_jarpack\jcmd2*.*
