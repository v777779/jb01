package ch15.ex11.access;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 11 Generic Check\n");
        Map<String,Ball> map = New.map();
        List<Goal> list = New.list();
        Set<Doors> set = New.set();
        Queue<Ball> queue = New.queue();

        map.put("Start",new Ball());
        list.add(new Goal());
        set.add(new Doors());
        queue.add(new Ball());

        System.out.println(map);
        System.out.println(list);
        System.out.println(set);
        System.out.println(queue);

    }
}
