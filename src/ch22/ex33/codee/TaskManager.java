package ch22.ex33.codee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 25-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TaskManager<R, C extends Callable<R>> extends ArrayList<TaskItem<R, C>> {
    private ExecutorService exec = Executors.newSingleThreadExecutor(); // ограничиваем все задачи очередью чтобы не грузить комп

    public void add(C task) { // добавить Callable<String> задачу
        add(new TaskItem<R, C>(exec.submit(task), task));  // <Future, Callable task>  тут же запустить ее через submit

    }

    public List<R> getResults() {
        Iterator<TaskItem<R, C>> items = iterator(); // прогнать объект класса по элементам
        List<R> results = new ArrayList<R>();
        while (items.hasNext()) {
            TaskItem<R, C> item = items.next();
            if (item.future.isDone()) {  // проверяем объект future задачи
                try {
                    results.add(item.future.get()); // получить результат

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                items.remove();
            }
        }
        return results;

    }

    public List<String> purge() {
        Iterator<TaskItem<R, C>> items = iterator();
        List<String> results = new ArrayList<String>();
        while (items.hasNext()) {
            TaskItem<R, C> item = items.next();
            if (!item.future.isDone()) {                   // проверяем объект future задачи
                results.add("Cancelling " + item.task);    // выдать название задачи
                item.future.cancel(true); // отключение все таки через Future<>
                items.remove();
            }
        }
        return results;
    }

}
