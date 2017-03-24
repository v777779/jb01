package ch11.ex04.integra;

import java.util.*;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Animals {
    ArrayList<String>  alist = new ArrayList<>();
    LinkedList<String> llist = new LinkedList<>();
    HashSet<String> hset = new HashSet<>();
    TreeSet<String> tset = new TreeSet<>();
    LinkedHashSet<String> lhset = new LinkedHashSet<>();
    HashMap<String, String> hmap = new HashMap<>();
    LinkedHashMap<String, String> lhmap = new LinkedHashMap<>();
    TreeMap<String,String> tmap = new TreeMap<>();



    public Collection fill(Collection<String> collect) {
        collect.add("rat");
        collect.add("cat");
        collect.add("dog");
        collect.add("mouse");
        collect.add("dog");

        return collect;
    }

    Map fill(Map<String, String> map) {
        map.put("rat", "Anni");
        map.put("cat", "Mangi");
        map.put("dog", "Greg");
        map.put("mouse", "Lori");
        map.put("dog", "Bob");
        return map;
    }

}
