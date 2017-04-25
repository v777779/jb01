package ch20.ex02m.exercise.annotate;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
@ExtractInterface("IDivisor")   // назначение вытащить открытый интерфейс класса
public class Divide {
    public int value;
    private String name;

    public int divide(int x, int y) {
        int total = 0;
        for (int i = x; i >= y  ; i-= y) {
            total = add(total,1);

        }
        return total;
    }

    private int add(int x, int y) {
        return x+y;
    }

}
