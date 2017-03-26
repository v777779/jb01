package ch16.ex21.local;

import java.util.Comparator;

/**
 * Created by V1 on 26.03.2017.
 */
public class CompTypeComparator implements Comparator<CompType>{

    @Override
    public int compare(CompType o1, CompType o2) {
        if(o1.i < o2.i) return -1;
        if(o1.i > o2.i) return 1;
        return 0;
    }
}
