echo off
set path=C:\Program Files\Java\jdk1.8.0_112\bin;%path%
javac  annotate/Mult.java -d ../../../../out/production/jb01 -s ./annotate -cp ../../../../out/production/jb01  -processor ch20.ex02m.exercise.annotate.IFEProc
javac  annotate/Math.java -d ../../../../out/production/jb01 -s ./annotate -cp ../../../../out/production/jb01  -processor ch20.ex02m.exercise.annotate.IFEProc
javac  annotate/Divide.java -d ../../../../out/production/jb01 -s ./annotate -cp ../../../../out/production/jb01  -processor ch20.ex02m.exercise.annotate.IFEProc
