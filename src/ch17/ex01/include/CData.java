package ch17.ex01.include;

import lib.utils.IGenerator;

import java.util.ArrayList;

/**
 * Created by V1 on 3/27/2017.
 */
public class CData<T> extends ArrayList<T> {

    public CData(IGenerator<T> gen, int size) {
        for (int i = 0; i <size ; i++) {  // генератор списка
            add(gen.next());  // заполнение стандартным методом
        }
    }

    public static<T> CData<T> getList(IGenerator<T> gen, int size ) {
        return new CData<T>(gen,size);// получить готовый список методом
    }

}
