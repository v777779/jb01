package ch21.ex11.codeb;

import java.io.IOException;

/**
 * Vadim Voronov
 * Created: 29-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ResponseUI extends Thread {
    private volatile double d = 1;

    public ResponseUI()  {
        setDaemon(true);
        start();

    }
    @Override
    public void run() {
        while (true) {
        d = d+(Math.PI + Math.E)/d;
        }
    }

    public void check() {
        try {
            new ResponseUI();
            System.out.print("ResponceUI input >");
            System.in.read();
            System.out.println(d);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
