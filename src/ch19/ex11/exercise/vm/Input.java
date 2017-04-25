package ch19.ex11.exercise.vm;

import java.util.ArrayList;
import java.util.List;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class Input {
    private static List<Good> list = new ArrayList<>();
    private Good good;
    private int value;

    Input(Good good) {  // создать объект по товару
        this.good = good;
        value = good.getCost();
    }

    int amount() {
        return value;
    }

    public Category getCategory() {
        return good.getCat();
    }

    @Override
    public String toString() {
        return good.getName();
    }
}
