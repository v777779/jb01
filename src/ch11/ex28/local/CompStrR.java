package ch11.ex28.local;

import java.util.Comparator;

/**
 * Created by V1 on 28-Feb-17.
 */
public class CompStrR implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
