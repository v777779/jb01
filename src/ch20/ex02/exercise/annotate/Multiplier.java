package ch20.ex02.exercise.annotate;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
@ExtractInterface("IMultiplier")   // назначение вытащить открытый интерфейс класса
public class Multiplier {
    public int multiply(int x, int y) {
        int total = 0;
        for (int i = 0; i < x; i++) {
            total = add(total,y);
        }
        return total;
    }

    private int add(int x, int y) {
        return x+y;
    }

}
