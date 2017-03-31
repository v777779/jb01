package lib.maps;

import lib.utils.Print;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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

        map.putAll(new CMapInt(25));    // CMapInt эмулятор map с заполненными данными
        map.putAll(new CMapInt(25));    // CMapInt эмулятор map с заполненными данными
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
        map.keySet().remove(5);
        System.out.println("keyset().remove(5):");
        printKeys(map);
        map.clear();
        System.out.println("isEmpty()           :" + map.isEmpty());
        map.putAll(new CMapInt(25));
        map.keySet().removeAll(map.keySet()); // удаление через keyset
        System.out.println("keyset().removeAll():" + map.isEmpty());
        System.out.println();
    }

    public static void checkSMap(Map<String,String> sMap) {

        sMap.putAll(Countries.capitals(25));
        System.out.println("size:"+sMap.size());
        System.out.println(Print.r(sMap.toString()));

        System.out.println("containsKey(COMOROS):"+sMap.containsKey("COMOROS"));
        System.out.println("containsValue(Accra):"+sMap.containsValue("Accra"));
        System.out.println("remove(COMOROS):"+sMap.remove("COMOROS"));
        System.out.println("remove(GHANA):"+sMap.remove("GHANA"));
        System.out.println("size:"+sMap.size());
        System.out.println(Print.r(sMap.toString()));

        System.out.println("containsKey(COMOROS):"+sMap.containsKey("COMOROS"));
        System.out.println("containsValue(Accra):"+sMap.containsValue("Accra"));
        System.out.println(Print.r(sMap.toString()));

        System.out.println("remove first key:"+sMap.remove(sMap.keySet().iterator().next()));
        System.out.println(Print.r(sMap.toString()));

        System.out.println("size:"+sMap.size());
        System.out.println("isEmpty:"+sMap.isEmpty());
        sMap.clear();
        System.out.println("clear():"+sMap.isEmpty());
        System.out.println("size:"+sMap.size());

    }
    public static void checkIMap(Map<Integer,Integer> sMap) {

        sMap.putAll(Maps.ints(10));
        System.out.println(sMap);
        sMap.putAll(Maps.ints(2));
        System.out.println(sMap);

        System.out.println("Keys  :");
        System.out.println(sMap.keySet());
        System.out.println("Values:");
        System.out.println(sMap.values());
        System.out.println(sMap);
        Integer[] ints = sMap.keySet().toArray(new Integer[0]);
        Integer[] vals = sMap.values().toArray(new Integer[0]);

        System.out.println("containsKey(" + ints[11] + ") :" + sMap.containsKey(ints[11]));
        System.out.println("get(" + ints[11] + ")          :" + sMap.get(ints[11]));
        System.out.println("containsValue(" + vals[5] + "):" + sMap.containsValue(vals[5]));

        Integer key = sMap.keySet().iterator().next();
        System.out.println("First key        :" + key);
        sMap.remove(key);
        System.out.println("First key removed:");
        System.out.println(sMap);
        System.out.println("size:" + sMap.size());
        System.out.println("isEmpty()           :" + sMap.isEmpty());

        System.out.println("keyset().remove(" + ints[7] + "):");
        sMap.keySet().remove(ints[7]);
        System.out.println(sMap);
        System.out.println("size:" + sMap.size());
        System.out.println("isEmpty()           :" + sMap.isEmpty());
        System.out.println("clear()             :");
        sMap.clear();
        System.out.println("isEmpty()           :" + sMap.isEmpty());
        System.out.println("size:" + sMap.size());
        sMap.putAll(Maps.ints(10));
        System.out.println(sMap);
        System.out.println("isEmpty()           :" + sMap.isEmpty());
        System.out.println("keyset():" + sMap.keySet());

        System.out.println("keyset().removeAll():");
        sMap.keySet().removeAll(sMap.keySet()); // удаление через keyset
        System.out.println(sMap);
        System.out.println("size:" + sMap.size());
        System.out.println("isEmpty()           :" + sMap.isEmpty());

        sMap.putAll(Maps.ints(10));
        System.out.println(">" + sMap);

        Map<Integer, Integer> sub = new HashMap<>();
        sub.putAll(sMap);
        System.out.println(":" + sub);
        ints = sub.keySet().toArray(new Integer[0]);
        sub.remove(ints[5]);
        sub.remove(ints[7]);
        System.out.println(":" + sub);
        System.out.println("keyset().removeAll():" + sMap.isEmpty());
        sMap.keySet().removeAll(sub.keySet());
        System.out.println(">" + sMap);
        sMap.keySet().removeAll(sMap.keySet());
        System.out.println("keyset().removeAll():" + sMap.isEmpty());
        System.out.println(">" + sMap);

        System.out.println();
    }

    public static Map<Integer, Integer> ints(int size) {
        Map<Integer, Integer> map = new HashMap<>();
        Random rnd = new Random();
        for (int i = 0; i < size ; i++) {
            map.put(rnd.nextInt(100000),rnd.nextInt(10000));
        }
        return map;
    }

}
