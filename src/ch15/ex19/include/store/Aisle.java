package ch15.ex19.include.store;

import java.util.ArrayList;

/**
 * Created by V1 on 17.03.2017.
 */
public class Aisle extends ArrayList<Shelf> {
    public Aisle(int nShelves, int nProducts) {  // конструктор генерит полки
        for (int i = 0; i < nShelves; i++) {  // тоже самое без генератора т.к. есть параметр
            add(new Shelf(nProducts)); // это не генератор, так как есть параметр
        }
    }
}
