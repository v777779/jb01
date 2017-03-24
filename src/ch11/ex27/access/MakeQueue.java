package ch11.ex27.access;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by V1 on 27-Feb-17.
 */
public class MakeQueue {
    private static final String[] S_CMD = new String[]{
            "start",
            "stop",
            "run",
            "init",
            "up",
            "down",
            "suspend",
            "sleep",
            "wakeup",
            "shutdown",
            "reset"
    };
    private static Random rnd = new Random();

    public static Queue<Command> getQ(int size) {  // заполняем ссылку не даем
        Queue<Command> q = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            q.offer(new Command(S_CMD[rnd.nextInt(S_CMD.length)]));
        }
        return q;
    }
}
