package ch17.ex11.local;

import lib.utils.IGenerator;

import java.util.Queue;

/**
 * Created by V1 on 29-Mar-17.
 */
public class QueueB {
    private static int count = 10;

    public static class Gen implements IGenerator<String> {
        private String[] ss = ("one two three four five six seven eight " +
                "nine ten").split(" ");
        private int i;

        @Override
        public String next() {
            return ss[i++];
        }
    }


    public static <T> void check(Queue<T> q, IGenerator<T> gen) {
        for (int i = 0; i < count; i++) {
            q.offer(gen.next());
        }
        System.out.printf("%-22s:",q.getClass().getSimpleName());
        while (q.peek() != null) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }


}
