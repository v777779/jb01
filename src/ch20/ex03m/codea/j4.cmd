echo off
set path=C:\Program Files\Java\jdk1.8.0_112\bin;%path%
rem echo %PATH%
rem java -version
javac  dbase/Member.java -d ../../../../out/production/jb01 -cp ../../../../out/production/jb01  -processor ch20.ex03m.codea.dbase.TCPFactory
