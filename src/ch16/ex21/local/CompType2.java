package ch16.ex21.local;

import lib.utils.IGenerator;

import java.util.Comparator;
import java.util.Random;

/**
 * Created by V1 on 26.03.2017.
 */
public class CompType2  {
    private static int count = 1;
    private static Random rnd = new Random();
    int i;
    int j;

    public CompType2(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public static IGenerator<CompType2> gen() {  // метод с внутренним классом
        return new IGenerator<CompType2>() {
            @Override
            public CompType2 next() {
                return new CompType2(rnd.nextInt(100), rnd.nextInt(100));
            }
        };
    }

    private static class Comp implements Comparator<CompType2> {
        @Override
        public int compare(CompType2 o1, CompType2 o2) {
            if (o1.i < o2.i) {
                return -1;
            }
            if (o1.i > o2.i) {
                return 1;
            }
            return 0;
        }
    }

    public static Comp getComparator() {
        return new Comp();
    }

    public static String toString(CompType2[] c) {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int i = 0; i < c.length; i++) {
            sb.append(c[i] + " ");
            if ((i + 1) % 4 == 0) {
                sb.append("\n");
            }
        }
        if (c.length % 4 == 0) {
            sb.append("]");
        } else {
            sb.append("\n]");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("CompType[%2d,%2d]", i, j);
    }

}
