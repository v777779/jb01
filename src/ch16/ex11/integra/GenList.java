package ch16.ex11.integra;

import lib.utils.IGenerator;

import java.util.ArrayList;

/**
 * Created by V1 on 26.03.2017.
 */
public class GenList<T> extends ArrayList<T> {
    public GenList(IGenerator<T> gen, int size) {
        for (int i = 0; i < size; i++) {
            add(gen.next()); // add to ArrayList
        }
    }
    public static <T> GenList<T> get(IGenerator<T> gen, int size) {
        return new GenList<T>(gen,size);
    }
}
