package ch16.ex08.access;

import lib.ball.Ball;
import lib.utils.Range;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static <T> T[] getArray(int size) {
        return (T[]) new Object[size];
    }

    public static String[] getArray2(int size) {
        return (String[]) new Object[size];
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 8 Array w Generic Check\n");

        System.out.println("\nParametrized <T>[] Class Creation:");
        try {
            ClassParam<Ball> cn = new ClassParam<>();    //параметризованный массив Ball[]  НЕ создан
            cn.сobjects[0] = new Ball();                 // не работает Runtime
//          cn.сobjects[0] = new Integer(1);                // не работает компилятор
        } catch (Exception e) {
            System.out.println("Array cast exception ");
        }

        System.out.println("\nParametrized <T>[] Method Creation:");
        try {
            String[] strings = getArray(10);        //параметризованный массив Ball[] создан
            strings[0] = Range.randomStr();             // не работает Runtime
//          strings[0] = new Integer(0);                // не работает компилятор

        } catch (Exception e) {
            System.out.println("Array cast exception ");
        }

    }
}
