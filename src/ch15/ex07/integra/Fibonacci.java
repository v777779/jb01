package ch15.ex07.integra;

/**
 * Created by V1 on 15.03.2017.
 */
public class Fibonacci{
    private int count =0;
    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return(fib(n-2)+fib(n-1)); // следующее число сумма двух предыдущих
    }

    public Integer next() {
        return fib(count++);
    }

}
