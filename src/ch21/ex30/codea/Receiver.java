package ch21.ex30.codea;

import java.io.IOException;
import java.io.PipedReader;
import java.util.Random;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Receiver implements Runnable {
    private Random rnd = new Random();
    private PipedReader in;

    public Receiver(Sender sender) {
        try {
            this.in = new PipedReader(sender.getPipedWriter());
        } catch (IOException e) {
            System.out.println(e+" Receiver exception ");
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Read: "+(char)in.read()+", ");
            }
        } catch (IOException e) {
            System.out.println(e + " Receiver read exception");
        }

    }
}
