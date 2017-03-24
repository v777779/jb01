package ch.ex40.access.latent;

import java.util.ArrayList;

/**
 * Created by V1 on 22.03.2017.
 */
public class FilledList<T> extends ArrayList<T> {

    public FilledList(Class<? extends T> type, int size) {
        try {           // конструктор создания списка компонентов заданного типа
            for (int i = 0; i < size; i++) {
                add(type.newInstance());  // тип должен иметь конструктор по умолчанию
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
