package ch21.ex11.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 01-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SyncEventStringThread implements Runnable {
    private static int counter = 0;
    private int id = counter++;
    private SyncEventString e;

    public SyncEventStringThread(SyncEventString e) {
        this.e = e;
    }

    @Override
    public void run() {
        int count = 0;
        if(e.isCancel()) {
            return;
        }
        System.out.println("#" + id + " started...");
        while(!e.isCancel()){
            count++;
            e.change();
            if(!e.getS().equals("one") || !e.getS2().equals("two")){
                e.setCancel();
                break;
            }
        }
        System.out.println("#"+id+" exit on string "+count);

    }

    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool();
        SyncEventString e = new SyncEventString();
        for (int i = 0; i < 10; i++) {
            exec.execute(new SyncEventStringThread(e));  // один объект отдаем всем потокам
        }
    }
}
