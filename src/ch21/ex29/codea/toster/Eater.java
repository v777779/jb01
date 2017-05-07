package ch21.ex29.codea.toster;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Eater implements Runnable {
    private ToastQueue finishedQueue;
    private int counter = 0;


    public Eater(ToastQueue finishedQueue) {
        this.finishedQueue = finishedQueue;

    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Toast t = finishedQueue.take(); // взять готовый бутерброд из очереди
                if(t.getId() != counter++ || t.getStatus() != Toast.Status.JAMMED) {
                    System.out.println(">>>> Error :"+t);
                    System.exit(1); // выдать закрытие всего конвейера
                }else {
                    System.out.println("Chomp! "+t);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Eater interrupted");
        }
        System.out.println("Eater off");
    }
}
