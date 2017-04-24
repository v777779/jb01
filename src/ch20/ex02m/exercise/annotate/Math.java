package ch20.ex02m.exercise.annotate;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
@ExtractInterface("IMath")   // назначение вытащить открытый интерфейс класса
public class Math {
    public int value;
    private String name;
    public int multiply(int x, int y) {
        int total = 0;
        for (int i = 0; i < x; i++) {
            total = add(total,y);
        }
        return total;
    }
    public int divide(int x, int y) {
        int total = 0;
        for (int i = x; i >0 ; i-= y) {
            total = add(total,1);
        }
        return total;
    }

    private int add(int x, int y) {
        return x+y;
    }

}
