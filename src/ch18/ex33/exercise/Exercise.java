package ch18.ex33.exercise;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise Check\n");
        String pathName = "./src/ch18/ex33/exercise";
        PrefCatalog.check(pathName);
        PrefCatalog.check(pathName);
        PrefCatalog.check(pathName);
        pathName = "./src/ch18/ex33";
        PrefCatalog.check(pathName);
    }
}
