package lib.units.util;

import lib.utils.IGenerator;

import java.lang.reflect.Array;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Generated {
    public static <T> T[] array(T[] array, IGenerator<T> gen) {
        return new CollectionData<T>(gen, array.length).toArray(array);  // ОБЯЗАТЕЛЬНО Экземпляр в toArray
    }

    public static <T> T[] array(Class<?> type, IGenerator<T> gen, int size) {
        T[] array = (T[]) Array.newInstance(type, size);      // создать новый массив из объектов класса
        return new CollectionData<T>(gen, array.length).toArray(array); // заполнить массив через коллекцию
    }
}
