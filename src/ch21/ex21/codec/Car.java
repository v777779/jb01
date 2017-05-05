package ch21.ex21.codec;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Car {
    private boolean waxOn = false;

    public synchronized void waxed() {  // синхронизированный метод но нет handshake
        waxOn = true;
        notifyAll();
    }

    public synchronized void buffed() {  // синхронизированный метод но нет handshake
        waxOn = false;
        notifyAll();
    }

    public synchronized void waitForWaxing() throws InterruptedException {  // синхронизированный метод но нет handshake
        while (waxOn == false) {  // постоянно вызываем эту команду  НЕОБЯЗАТЕЛЬНО
            wait();
        }
    }

    public synchronized void waitForBuffing() throws InterruptedException {  // синхронизированный метод но нет handshake
        while (waxOn == true) {  // постоянно вызываем эту команду  НЕОБЯЗАТЕЛЬНО
            wait();
        }
    }

}
