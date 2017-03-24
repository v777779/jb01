package ch14.ex11.integra;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by V1 on 09-Mar-17.
 */
public class FilledList<T> {  // обобщенный тип
    private Class<T> type;

    public FilledList(Class<T> type) {   // создается экземпляр заданного типа
        this.type = type;
    }

    public List<T> create(int elements) {
        List<T> list = new ArrayList<>();
        try {
            for (int i = 0; i < elements; i++) {
                list.add(type.newInstance()); // добавляем элемент заданного типа
            }

        } catch (Exception e) {
            System.out.println("Error of init List");
            throw new RuntimeException(); // вылетаем из программы
        }
        return list;
    }


    @Override
    public String toString() {
        return "FilledList.type: "+type.getSimpleName();
    }

}
