package ch21.ex21.codec;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class WaitCheck {
    private static class WaitClass {
        public void enterWait() throws InterruptedException {

            System.out.println("Enter to wait...");
            synchronized (this) {
                wait();
            }
            System.out.println("Exit from wait...");
        }

    }

    public static void check() {
        System.out.println("Wait and Exit new Thread().notify() Check");

        WaitClass w = new WaitClass();
        new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        TimeUnit.MILLISECONDS.sleep(100);
                        System.out.print(".");
                    }
                    System.out.println();
                    synchronized (w) {
                        w.notify();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();

// enetring into wait() state exit via external notify()
        try {
            w.enterWait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
