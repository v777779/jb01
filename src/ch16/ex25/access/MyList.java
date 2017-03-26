package ch16.ex25.access;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

/**
 * Created by V1 on 26.03.2017.
 */
public class MyList extends ArrayList<Integer> {
    public MyList(Collection<? extends Integer> c) {
        super(c);
    }

    public static Comparator<Integer> reversed() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2) return 1;
                if(o1> o2) return -1;
                return 0;
            }
        };
    }
}
