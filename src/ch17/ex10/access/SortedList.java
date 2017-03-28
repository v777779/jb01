package ch17.ex10.access;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by V1 on 28-Mar-17.
 */
public class SortedList extends LinkedList<String> {

    public SortedList(List<String> list) {
        Collections.sort(list);
        addAll(list);
    }

    public String first() {
        return get(0);
    }
    public String last() {
        return get(size()-1);
    }

    public SortedList subSet(String from, String to) {
        int indexFrom = indexOf(from);
        int indexStringo = indexOf(to);

        return new SortedList(subList(indexFrom, indexStringo));
    }

    public SortedList headSet(String to) {
        int indexStringo = indexOf(to);
        return new SortedList(subList(0, indexStringo));
    }

    public SortedList tailSet(String from) {
        int indexFrom = indexOf(from);
        return new SortedList(subList(indexFrom, size()));
    }

}
