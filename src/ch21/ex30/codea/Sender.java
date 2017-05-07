package ch21.ex30.codea;

import java.io.IOException;
import java.io.PipedWriter;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Sender implements Runnable {
    private Random rnd = new Random();
    private PipedWriter out = new PipedWriter();
    public PipedWriter getPipedWriter() {
        return out;
    }

    @Override
    public void run() {
        try {
            while (true) {
                for(char c ='A';c< 'z';c++) {  // выдать символы алфавита
                    out.write(c);
                }
                TimeUnit.MILLISECONDS.sleep(500);
            }
        } catch (IOException e) {
            System.out.println(e+" Sender write exception");
        } catch (InterruptedException e) {
            System.out.println(e+ " Sender sleep interrupted");
        }

    }
}
