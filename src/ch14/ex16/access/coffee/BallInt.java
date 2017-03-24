package ch14.ex16.access.coffee;

import java.util.Iterator;

/**
 * Created by V1 on 10-Mar-17.
 */
public class BallInt implements Iterable<Integer> {

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int count = 10;
            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public Integer next() {
                count--;
                return (count);
            }
        };
    }

    @Override
    public String toString() {
        return "Ball{}";
    }
}
