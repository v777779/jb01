package ch21.ex31.codea.sticks;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Chopstick {
    private boolean taken = false;
    public String name;

    public Chopstick(String name) {
        this.name = name;
    }

    public synchronized void take(String s) throws InterruptedException{
        while (taken) {  // если taken == false то проходит и ставит taken=true
            System.out.println("locked:"+s);
            wait();      // если taken = true то lock and wait()
        }               // тоже самое если просто wait() то lock по this
        System.out.println("taken:"+s);
        taken = true;
    }

    public synchronized void drop() {
        taken = false; // сбросить
        notifyAll();  // lock идет по this вскрыть wait()
    }
}
