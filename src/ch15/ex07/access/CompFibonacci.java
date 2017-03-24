package ch15.ex07.access;

import java.util.Iterator;

/**
 * Created by V1 on 15.03.2017.
 */
public class CompFibonacci implements Iterable<Integer>{
    private Fibonacci fb = new Fibonacci();
    private int size;

    public CompFibonacci(int size) {
        this.size = size;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return (size > 0);
            }

            @Override
            public Integer next() {
                size--;
                return CompFibonacci.this.fb.next();
            }
        };
    }
}
