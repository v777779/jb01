package ch20.ex04.codea;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 25-Apr-17.
 */
public class MathFunc {
    int calls;

    public int getCalls() {
        return calls;
    }

    public long factorial(int number) {
        calls++;

        if (number < 0)
            throw new IllegalArgumentException();

        long result = 1;
        if (number > 1) {
            for (int i = 1; i <= number; i++)
                result = result * i;
        }

        return result;
    }

    public long plus(int num1, int num2) {
        calls++;
        return num1 + num2;
    }

}
