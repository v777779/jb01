package ch11.ex23.local;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by V1 on 24-Feb-17.
 */
public class Stat {
    private Random rnd = new Random();
    private Map<Integer,Integer> m = new HashMap<>();

    public Stat() {
        fillMap();
    }

    public void fillMap() {
        m.clear();
        for (int i = 0; i < 10000; i++) {
            int key = rnd.nextInt(20);  // 0..19
            Integer value = m.get(key);
            if (value == null) {        // нет такого объекта
                m.put(key, 1);       // пишем 1
            } else {
                m.put(key,value+1);  // добавляем 1
            }
        }
    }

    public Integer getMaxKey() {
        int max = 0;
        int key = 0;
        for (Integer keyInt : m.keySet()) {
            if (m.get(keyInt) > max) {
                max = m.get(keyInt);
                key = keyInt;
            }
        }

        return key; // выдать ключ
    }

    public Integer getVal(int key) {
        return m.get(key);
    }

    public void showMap() {
        System.out.println(m);
    }

}
