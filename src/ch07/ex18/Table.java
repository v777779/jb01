package ch07.ex18;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Table {
    static Random rnd = new Random();


    final int FINAL_INT = rnd.nextInt(100);
    final int FINAL_INT2;
    final static int FINAL_S_INT = rnd.nextInt(100);
    final static int FINAL_S_INT2;
    final Leg[] legs = new Leg[]{new Leg(1), new Leg(2), new Leg(3), new Leg(4)};
    final Leg[] legs2 = new Leg[4];

    final static Desk desk;

    static {
        FINAL_S_INT2 = rnd.nextInt(100);  // вау инициализация статической
        desk  = new Desk();

    }

    public Table() {
        System.out.println("Table.Table");
        FINAL_INT2 = rnd.nextInt(100);  // вау инициализация константы
        for (int i = 0; i < legs2.length; i++) {
             legs2[i] = new Leg(rnd.nextInt(25));

        }
    }

    @Override
    public String toString() {
        return "Table{" +
                "FINAL_INT=" + FINAL_INT +
                ", FINAL_INT2=" + FINAL_INT2 +
                ", FINAL STATIC=" + Table.FINAL_S_INT+
                ", FINAL STATIC=" + Table.FINAL_S_INT2+
                ", Desk =" + Table.desk+
                ", legs=" + Arrays.toString(legs) +
                ", legs=" + Arrays.toString(legs2) +

                '}';
    }
}
