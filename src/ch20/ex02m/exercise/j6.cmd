echo off
javac  annotate/Mult.java -d ../../../../out/production/jb01 -s ./annotate -cp ../../../../out/production/jb01  -processor ch20.ex02m.exercise.annotate.IFEProc
javac  annotate/Math.java -d ../../../../out/production/jb01 -s ./annotate -cp ../../../../out/production/jb01  -processor ch20.ex02m.exercise.annotate.IFEProc
javac  annotate/Divide.java -d ../../../../out/production/jb01 -s ./annotate -cp ../../../../out/production/jb01  -processor ch20.ex02m.exercise.annotate.IFEProc
