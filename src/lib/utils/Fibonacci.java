package lib.utils;

/**
 * Created by V1 on 15.03.2017.
 */
public class Fibonacci implements IGenerator<Integer> {  // интерфейс генератора делает @OVerride next()
    private int count =0;
    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return(fib(n-2)+fib(n-1)); // следующее число сумма двух предыдущих
    }
    @Override  // IGenerator
    public Integer next() {
        return fib(count++);
    }

}
