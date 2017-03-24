package ch15.ex11.local;

import java.util.*;

/**
 * Created by V1 on 16.03.2017.
 */
public class New {
    public static <K,V> Map<K,V> map() {
        return new HashMap<K, V>();
    }

    public static <T> List<T> list() {
        return new ArrayList<T>();
    }

    public static <T> Set<T> set() {
        return new HashSet<T>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }

}
