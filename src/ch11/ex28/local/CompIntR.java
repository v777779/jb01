package ch11.ex28.local;

import java.util.Comparator;

/**
 * Created by V1 on 28-Feb-17.
 */
public class CompIntR implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
