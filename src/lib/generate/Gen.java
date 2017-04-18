package lib.generate;

import lib.utils.IGenerator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by V1 on 26.03.2017.
 */
public class Gen { // ArrayCPP IGenerator
    public static <T> T[] getArray(T[] array, IGenerator<T> gen) {
        return new GenList<T>(gen, array.length).toArray(array);  // ОБЯЗАТЕЛЬНО Экземпляр в toArray
    }

    public static <T> T[] getArray(Class<?> type,IGenerator<T> gen, int size) {
            T[] array = (T[])Array.newInstance(type, size);      // создать новый массив из объектов класса
        return new GenList<T>(gen, array.length).toArray(array); // заполнить массив через коллекцию
    }


    public static <T> ArrayList<T> getList(Class<?> type, IGenerator<T> gen, int size) {
        T[] array = (T[])Array.newInstance(type, 0);      // создать новый массив из объектов класса
        ArrayList<T> list = new ArrayList<T>(Arrays.asList(new GenList<T>(gen,array.length).toArray(array)));
        return list; // заполнить массив через коллекцию
    }


}
