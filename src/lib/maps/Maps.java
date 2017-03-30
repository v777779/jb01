package lib.maps;

import java.util.Map;

/**
 * Created by V1 on 30-Mar-17.
 */
public class Maps {
    public static void printKeys(Map<Integer, String> map) {
        System.out.println("Size:" + map.size() + ", Keys:");
        System.out.println(map.keySet());
    }

    public static void check(Map<Integer, String> map) {
        System.out.println(map.getClass().getSimpleName()+":");

        map.putAll(new CIntMap(25));    // CIntMap эмулятор map с заполненными данными
        map.putAll(new CIntMap(25));    // CIntMap эмулятор map с заполненными данными
        printKeys(map);
        System.out.println("Values:");
        System.out.println(map.values());
        System.out.println(map);
        System.out.println("containsKey(11) :" + map.containsKey(11));
        System.out.println("get(11)          :" + map.get(11));
        System.out.println("containsValue(F0):" + map.containsValue("F0"));
        Integer key = map.keySet().iterator().next();
        System.out.println("First key        :" + key);
        map.remove(key);
        System.out.println("First key removed:");
        printKeys(map);
        map.clear();
        System.out.println("isEmpty()        :" + map.isEmpty());
        map.putAll(new CIntMap(25));
        map.keySet().removeAll(map.keySet()); // удаление через keyset
        System.out.println("isEmpty() after removal via keyset() :" + map.isEmpty());
        System.out.println();


    }
}
