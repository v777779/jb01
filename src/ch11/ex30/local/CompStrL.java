package ch11.ex30.local;

import java.util.Comparator;

/**
 * Created by V1 on 28-Feb-17.
 */
public class CompStrL implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        Integer size1 = o1.length();
        Integer size2 = o2.length();

        return o1.compareTo(o2);
    }
}
