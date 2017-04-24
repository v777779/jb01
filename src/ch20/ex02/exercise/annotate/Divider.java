package ch20.ex02.exercise.annotate;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
@ExtractInterface("IDivider")   // назначение вытащить открытый интерфейс класса
public class Divider {
    public int divide(int x, int y) {
        int total = 0;
        for (int i = x; i > y ; i-=y) {
            total = add(total,1);
        }
        return total;
    }

    private int add(int x, int y) {
        return x+y;
    }

}
