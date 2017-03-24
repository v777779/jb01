package ch15.ex14.access;

import lib.utils.IGenerator;

/**
 * Created by V1 on 16.03.2017.
 */
public class GenBasic<T> implements IGenerator {
    private Class<T> type;

    public GenBasic(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance(); // создаем экземпляр заданного класса

        } catch (Exception e) {
            throw new RuntimeException("Can't create Instance");
        }
    }

    public static <T> IGenerator<T> create(Class<T> type) {  // генератор компонентов для заданного типа
        return new GenBasic<T>(type);
    }

}
