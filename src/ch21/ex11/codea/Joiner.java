package ch21.ex11.codea;

/**
 * Vadim Voronov
 * Created: 29-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Joiner extends Thread {
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper) {
        super(name); // Thread(name)
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {
        try {
            System.out.println(getName()+" join started");
            sleeper.join();

        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }

        System.out.println(getName()+" join completed");
    }
}
