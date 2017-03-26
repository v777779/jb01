package ch16.ex21.local;

import lib.utils.IGenerator;

import java.util.Random;

/**
 * Created by V1 on 26.03.2017.
 */
public class CompType implements Comparable<CompType> {
    private static int count = 1;
    private static Random rnd = new Random();
    int i;
    int j;

    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public static IGenerator<CompType> gen() {  // метод с внутренним классом
        return new IGenerator<CompType>() {
            @Override
            public CompType next() {
                return new CompType(rnd.nextInt(100), rnd.nextInt(100));
            }
        };
    }

    @Override
    public int compareTo(CompType o) {
        if (i < o.i) {
            return -1;
        }
        if (i > o.i) {
            return 1;
        }
        return 0;
    }

    public static String toString(CompType[] c) {
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
