package ch16.ex23.access;

import java.util.Comparator;

/**
 * Created by V1 on 26.03.2017.
 */
public class CompRev implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        }
        if (o1 < o2) {
            return 1;
        }
        return 0;
    }
}
