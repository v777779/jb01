package ch21.ex11.codea;

/**
 * Vadim Voronov
 * Created: 29-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name); // Thread(name)
        duration = sleepTime;
        start();
    }

    @Override
    public void run() {
        try {
            System.out.println(getName()+" started");
            sleep(duration);  // спим в миллисекундах

        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted. " +
                    "isInterrupted()): " + isInterrupted());
            return;
        }
        System.out.println(getName()+" has awakened"); // проснулся
    }
}
