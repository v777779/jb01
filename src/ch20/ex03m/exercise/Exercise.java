package ch20.ex03m.exercise;

import lib.files.JComp;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Feb-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 03m javac Annotation with Visitor Pattern Check\n");

        String path = "./src/ch20/ex03m/exercise/dbase/";
        String processor = "ch20.ex03m.exercise.dbase.TCPFactory";
        JComp.compileJava(path,processor,".*.java");  // all files in the path

    }
}
