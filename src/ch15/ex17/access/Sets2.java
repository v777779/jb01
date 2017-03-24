package ch.ex17.access;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by V1 on 16.03.2017.
 */
public class Sets2 {
    private static <T> Set<T> copy(Set<T> s) {
        if (s instanceof EnumSet) {
            return ((EnumSet)s).clone();
        }
        return new HashSet<>(s);
    }

    public static <T> Set<T> union(Set<T> a, Set<T> b) { // базовая
        Set<T> hset = copy(a);
        hset.addAll(b);
        return hset;
    }
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) { // базовая
        Set<T> hset = copy(a);
        hset.retainAll(b); //  common btw a,b
        return hset;
    }

    public static <T> Set<T> difference(Set<T> a, Set<T> b) {  // вспомогательная
        Set<T> hset = copy(a);
        hset.removeAll(b); // a - b вычесть общие элементы
        return hset;
    }

    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a,b),intersection(a,b)); // (a+b)- (a-b)
    }



}
