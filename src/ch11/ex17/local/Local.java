package ch11.ex17.local;

import lib.utils.Range;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nMap Analyze Random  Check\n");

        Map<Integer,Integer> map = new HashMap<>();  // создали карту (key, value)
        for (int i = 0; i < 10000 ; i++) {  // ключ значение числа, значение повторы
            int value = Range.getInt(10); // от 0..19
            Integer freq = map.get(value); // получить частоту
            if (freq == null) {
                freq = 0;
            }
            map.put(value, freq+1); // нарастить значение для данного числа
        }

        System.out.println(map);
//        Set<Map.Entry<Integer, Integer>> set = map.entrySet();  // стандартный путь
//        for (Map.Entry<Integer, Integer> integerIntegerEntry : set) {
//        }
        for (Map.Entry<Integer, Integer> intEntry : map.entrySet()) { // прямой
            System.out.printf("%4d:%4d  %4.1f %%\n",intEntry.getKey(),intEntry.getValue(),
                    (double)Math.abs(intEntry.getValue()-1000)/10);
        }


    }
}
