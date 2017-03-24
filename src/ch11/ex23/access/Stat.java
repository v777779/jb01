package ch11.ex23.access;

import java.util.*;

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

    public Map<Integer,Integer> getMap() {
        return m;
    }

    public Iterator<Number> getItSet() {
        Set<Number> tSet = new TreeSet<>();

        for (Integer key : m.keySet()) {
            Number n = new Number(key, m.get(key));
            tSet.add(n); // добавить по уникальному ключу
        }
        return tSet.iterator(); // выдать ключ
    }



}
