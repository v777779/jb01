package lib.annot;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
@EIFace74("IMultiplier74")   // назначение вытащить открытый интерфейс класса
public class Mult2 {
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
