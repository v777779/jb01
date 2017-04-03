package hw;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 03-Apr-17.
 */
public class Main {
    public static void create2(int rSize, List collection) {
        ArrayList<List<Object>> rows = new ArrayList<List<Object>>(); // Коллекция коллекций обьектов
        ArrayList<Object> row = new ArrayList<Object>();
        ; // Коллекция обьектов

        if (rSize <= 0 || collection == null || collection.size() == 0) {
            return;  // уходим если входные данные кривые
        }
        int size = rSize;
        for (Object o : collection) {
            row.add(o);
            if (--size == 0) {
                size = rSize;
                rows.add(row);  // проверку row==null убрали т.к. отсекли в начале пустой запрос
                row = new ArrayList<Object>();
            }
        }
        if (row != null) {  // загружаем хвост
            rows.add(row);
        }
        System.out.println(rows);

    }

    public static ArrayList<List<Object>> create(int rSize, List collection) {
        ArrayList<List<Object>> rows = new ArrayList<List<Object>>(); // Коллекция коллекций обьектов
        ArrayList<Object> row = new ArrayList<Object>();
        ; // Коллекция обьектов

        if (rSize <= 0 || collection == null || collection.size() == 0) {
            return rows;  // уходим если входные данные кривые
        }
        int size = rSize;
        for (Object o : collection) {
            row.add(o);
            if (--size == 0) {
                size = rSize;
                rows.add(row);  // проверку row==null убрали т.к. отсекли в начале пустой запрос
                row = new ArrayList<Object>();
            }
        }
        if (row != null) {  // загружаем хвост
            rows.add(row);
        }
        return rows;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 38; i++) {
            list.add(i);
        }

        System.out.println(create(7, list));

    }
}
