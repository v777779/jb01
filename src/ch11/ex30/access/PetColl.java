package ch11.ex30.access;

import lib.pets.*;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by V1 on 28-Feb-17.
 */
public class PetColl extends PetBase implements Collection<Pet> {   // необходимо реализовать методы итератора

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

    @Override
    public Pet[] toArray() {
        return pets.clone();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        int size = (pets.length > a.length)? pets.length:a.length; // размер нового массива
        Pet[] res = new Pet[size];
        for (int i = 0; i < pets.length; i++) {
            res[i] = pets[i];
        }
        if (res.length > pets.length) {
            for (int i = pets.length; i < res.length ; i++) {
                res[i] = null;
            }
        }
       return (T[])res; // сделали кастинг на выходе
    }


    @Override
    public boolean isEmpty() {
        return (pets.length == 0);
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) {
            return false;
        }
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Iterator <?> it = c.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {  // прогнать все элементы c[] через свой массив
                return false;           // если хоть один не равен вылетаем
            }
        }
        return true;
    }

    // Unsupported operation

    @Override
    public boolean add(Pet pet) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw  new UnsupportedOperationException();
    }
}
