package lib.generate;

import lib.utils.IGenerator;

import java.lang.reflect.Array;

/**
 * Created by V1 on 26.03.2017.
 */
public class Gen { // Array IGenerator
    public static <T> T[] getArray(T[] array, IGenerator<T> gen) {
        return new GenList<T>(gen, array.length).toArray(array);  // ОБЯЗАТЕЛЬНО Экземпляр в toArray
    }

    public static <T> T[] getArray(Class<?> type,IGenerator<T> gen, int size) {
            T[] array = (T[])Array.newInstance(type, size);      // создать новый массив из объектов класса
        return new GenList<T>(gen, array.length).toArray(array); // заполнить массив через коллекцию
    }


}
