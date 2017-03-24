package ch02.hw07;

/**
 * Created by V1 on 03-Feb-17.
 */
public class Incrementable {

    static void show() {
        System.out.println("incr StaticTest.i: "+StaticTest.i);
    }

    static void increment() {
        StaticTest.i++;
    }
}
