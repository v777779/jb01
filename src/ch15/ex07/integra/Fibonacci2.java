package ch15.ex07.integra;

import java.util.Iterator;

/**
 * Created by V1 on 15.03.2017.
 */
public class Fibonacci2 extends Fibonacci implements Iterable<Integer>{
    private int count =0;
    private int size;

    public Fibonacci2(int size) {
        this.size = size;
    }

    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return(fib(n-2)+fib(n-1)); // следующее число сумма двух предыдущих
    }

    public Integer next() {
        return fib(count++);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return (count < size);
            }

            @Override
            public Integer next() {
                return fib(count++);
            }
        };
    }
}
