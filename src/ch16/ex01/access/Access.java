package ch16.ex01.access;

import lib.utils.BerylliumSphere;
import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void check(BerylliumSphere[] b) {
        System.out.println(Arrays.toString(b));
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 1 Array Check\n");

// динамическая агрегатная инициализация
        check(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()}); // работает групповая инициализация
// агрегатная инициализация
        BerylliumSphere[] d = {
                new BerylliumSphere(), new BerylliumSphere(),
                new BerylliumSphere()
        };
        BerylliumSphere [] e;

// динамическая агрегатная инициализация
        e = new BerylliumSphere[]{
                new BerylliumSphere(), new BerylliumSphere(),
                new BerylliumSphere()
        };
// избыточная динамическая агрегатная инициализация
        BerylliumSphere[] f = new BerylliumSphere[] {
                new BerylliumSphere(), new BerylliumSphere(),
                new BerylliumSphere()
        };

        check(d);
        check(e);
        check(f);


    }
}
