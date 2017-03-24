package ch11.ex30.include;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * Created by V1 on 28-Feb-17.
 */
public class PetCollect extends AbstractCollection<Pet> {   // необходимо реализовать методы итератора
    private Pet[] pets = Pets.createArray(8);           // создается массив

    @Override
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


    @Override
    public int size() {
        return pets.length;
    }
}
