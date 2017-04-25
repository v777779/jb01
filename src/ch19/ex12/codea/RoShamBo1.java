package ch19.ex12.codea;

import java.util.Random;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public class RoShamBo1 {
    static final int SIZE= 20;
    private static Random rnd = new Random();
    private static IItem newItem() {
        switch (rnd.nextInt(3)) {
            default:
            case 0:
                return new Scissors();
            case 1:
                return new Papers();
            case 2:
                return new Rock();
        }
    }

    private static void match(IItem a, IItem b) {
        System.out.printf("%-10s vs  %-10s : %s\n",a,b,a.compete(b));
    }

    public static void check() {
        for (int i = 0; i < SIZE; i++) {
            match(newItem(),newItem());
        }
    }


}
