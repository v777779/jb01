package ch22.ex33.exercise;

import lib.swing.threads.TaskItem;

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
public class TMParallel<R, C extends Callable<R>> extends ArrayList<TaskItem<R, C>> {
    private ExecutorService exec = Executors.newCachedThreadPool(); // параллельное выполнение

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

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String s = "abcdefghigjklmnopqrstuvwxyz";
        for (int i = 0; i < s.length(); i++) {
            list.add(s.substring(i, i + 1));
        }

        List<String> list2 = new ArrayList<>(list);

        Iterator<String> it = list.iterator();
        int count = 0;
        while (it.hasNext()) {  // так работает
            String sNext = it.next();
            System.out.println(sNext);
            if (count++ % 3 == 0) {
                it.remove();
            }
        }
        System.out.println(list);

        count = 0;
        for (String s2 : list2) {  // так не работает
            System.out.println(s2);
            if (count++ % 3 == 0) {
                list2.remove(s2);
            }
        }
    }

}
