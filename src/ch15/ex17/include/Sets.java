package ch15.ex17.include;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by V1 on 16.03.2017.
 */
public class Sets {
    public static <T> Set<T> union(Set<T> a, Set<T> b) { // базовая
        Set<T> hset = new HashSet<T>(a);
        hset.addAll(b);
        return hset;
    }
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) { // базовая
        Set<T> hset = new HashSet<T>(a);
        hset.retainAll(b); //  common btw a,b
        return hset;
    }

    public static <T> Set<T> difference(Set<T> a, Set<T> b) {  // вспомогательная
        Set<T> hset = new HashSet<T>(a);
        hset.removeAll(b); // a - b вычесть общие элементы
        return hset;
    }

    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a,b),intersection(a,b)); // (a+b)- (a-b)
    }



}
