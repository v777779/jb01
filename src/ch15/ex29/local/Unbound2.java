package ch.ex29.local;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by V1 on 20.03.2017.
 */
public class Unbound2 {
    Map map1;
    Map<?,?> map2;
    Map <String,?> map3;

    void assign1(Map map) {
        System.out.println("Map map:");
        map1 = map;
        System.out.println("map1:"+map1);
    }
    void assign2(Map<?,?> map) {
        System.out.println("Map<?,?> map:");
        map2 = map;
        System.out.println("map2:"+map2);
    }
    void assign3(Map<String,?> map) {
        System.out.println("Map<String,?> map:");
        map3 = map;
        System.out.println("map3:"+map);
    }

    public void app() {
        System.out.println("New HashMap()");
        assign1(new HashMap());
        assign2(new HashMap<>());
        assign3(new HashMap<>());

        System.out.println("New HashMap<String,Integer>()");
        assign1(new HashMap<String,Integer>());
        assign2(new HashMap<String,Integer>());
        assign3(new HashMap<String,Integer>());

    }

}
