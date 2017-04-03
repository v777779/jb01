package ch17.ex38.access;

import lib.generate.GenRnd;
import lib.utils.IGenerator;

import java.lang.reflect.Field;
import java.util.HashMap;

/**
 * Created by V1 on 03-Apr-17.
 */
public class Factor {
    public static int capacity(HashMap hMap) {
        Object[] table = null;
        try {
            Field tableField = HashMap.class.getDeclaredField("table");
            tableField.setAccessible(true);  // получить доступ
            table = (Object[]) tableField.get(hMap);
        } catch (Exception e) {
            System.out.println("catch: can't get table size");
        }
        return (table == null? 0:table.length);
    }
/*    public static int capacity(HashMap hMap, double load) {
        int size = 16;  // init capacity
        while (size * load < hMap.size()) {
            size *= 2;
        }
        return size;
    }*/

    public static double get(HashMap hMap) {
        double factor = (double)hMap.size()/capacity(hMap);
        factor = (Math.round(factor*100));
        return factor/100;
    }

    public static void LoadTest(int size) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        IGenerator<Integer> genK = new GenRnd.GenInt(100);
        IGenerator<Integer> genV = new GenRnd.GenInt(100);

        for (int i = 0; i < size; i++) {
            hMap.put(genK.next(), genV.next());
            System.out.printf("hMap(%3d:%-3d) ", hMap.size(), capacity(hMap));
            if (i % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

}
