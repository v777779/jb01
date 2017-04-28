package ch21.ex05.codea;

import java.util.concurrent.Callable;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() {
        for (int i = 0; i < 10; i++) {
            System.out.print("#"+id+"."+i+" ");

        }

        return "result of TaskWithResult "+id;
    }
}
