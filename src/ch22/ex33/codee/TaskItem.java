package ch22.ex33.codee;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
 * Vadim Voronov
 * Created: 25-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TaskItem<R,C extends Callable<R>> {
    public final Future<R> future;   //R возврашаемое значение, Future это же объект Callable то есть должен возвращать
    public final C task;  // а это просто Callable<R> можно было не задавать, если только дальше нет потомков Callable<R>

    public TaskItem(Future<R> future, C task) {
        this.future = future;
        this.task = task;
    }
}
