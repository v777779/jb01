package ch11.ex32.access;

import lib.utils.Range;
import typeinfo.pets.Pet;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by V1 on 28-Feb-17.
 */
public class PetIterable extends PetSequence implements Iterable<Pet> {

//shuffle

    private int[] getIndexes() {
        Random rnd = new Random();
        int[] indexes = Range.rangeInt(pets.length);  // получить индексы по нарастающей

        for (int i = 0; i < indexes.length; i++) {   // простейший shuffle за один проход
            int index = rnd.nextInt(indexes.length); // получить случайный индекс
            int a = indexes[index];                  // swap
            indexes[index] = indexes[i];
            indexes[i] = a;
        }
        return indexes;
    }


    public Iterable<Pet> shfl() {

        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    private int[] indexes = getIndexes(); // перемешанные индексы
                    private int index = 0;
                    @Override
                    public boolean hasNext() {
                        return (index < indexes.length);
                    }

                    @Override
                    public Pet next() {
                        return pets[indexes[index++]]; // открутить индексы
                    }
                };
            }
        };
    }



//reversed
    public Iterable<Pet> rev() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    private int index = pets.length-1;
                    @Override
                    public boolean hasNext() {
                        return (index > -1);
                    }

                    @Override
                    public Pet next() {
                        return pets[index--];
                    }
                };
            }
        };
    }
// forward
    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return (index < pets.length);
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }
}
