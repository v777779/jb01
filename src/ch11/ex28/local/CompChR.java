package ch11.ex28.local;

import java.util.Comparator;

/**
 * Created by V1 on 28-Feb-17.
 */
public class CompChR implements Comparator<Character> {

    @Override
    public int compare(Character o1, Character o2) {
        return o2.compareTo(o1);
    }
}
