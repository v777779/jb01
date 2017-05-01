package ch21.ex11.codeb;

import java.io.IOException;

/**
 * Vadim Voronov
 * Created: 29-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class UnResponseUI {
    private volatile double d = 1;

    public UnResponseUI() {
        while (d > 0) {
            d = d + (Math.PI + Math.E) / d;
        }
    }

    public void check() {
        try {
            System.out.print("UnResponseUI input >");
            System.in.read(); // сюда не попадет
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
