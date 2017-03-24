package ch11.ex30.integra;

import lib.pets.*;
import java.util.Iterator;

/**
 * Created by V1 on 28-Feb-17.
 */
public class PetSeq extends PetBase {   // необходимо реализовать методы итератора
    private Pet[] pets = Pets.getArray(8);           // создается массив

    public Iterator<Pet> iterator() {

        return new Iterator<Pet>() {  // встроенный класс Iterator
            private int index = 0;    // относится к классу Iterator

            @Override
            public boolean hasNext() {
                return (index < pets.length);  //
            }

            @Override
            public Pet next() {             // вернуть следующий элемент массива
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException(); // выдаем Exception
            }
        };
    }

    public int size() {
        return pets.length;
    }
}
