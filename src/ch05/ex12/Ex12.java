package ch05.ex12;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Ex12 {
    public static void main(String[] args) {
        Tank tank = new Tank();  // false by default
        tank.setEmpty(true);
//
        new Tank();              // lost instance  empty false
        tank = null;             // lost instance  empty true

        System.gc();             // both instance were lost
        try {                    // задержка чтобы увидеть результаты работы GC
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
