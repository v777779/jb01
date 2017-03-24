package ch08.ex10;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Mouse {
    void  wakeup() {
        System.out.print("Beetle2.wakeup and ...");
        run();
    }

    void run() {
        System.out.print("Beetle2.run ...");
        sleep();
    }

    void sleep() {
        System.out.println("Beetle2.sleep");
    }


}
