package ch10.ex25.local;

/**
 * Created by V1 on 17-Feb-17.
 */
public class MyIncrement {
    private int value=25;
    public void increment() {
        value++;
        System.out.print("MyIncrement.increment."+value+" > ");
    }

    public void decrement() {
        value--;
        System.out.print("MyIncrement.decrement."+value+" > ");
    }

    public static void play(MyIncrement m) {
        m.increment();  // просто вызов через static method
        System.out.println();
    }
}
