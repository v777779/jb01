package ch14.ex09.access;

/**
 * Created by V1 on 08-Mar-17.
 */
public class Shelf extends Shop implements Colorable, Comparable,Cloneable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
