package ch11.ex32.local;

import java.util.*;

/**
 * Created by V1 on 28-Feb-17.
 */
public class ArrayListGen<T> extends ArrayList<T> {  // Generic <T>
    private Random rnd = new Random();

    public ArrayListGen(Collection<? extends T> c) {  // конструктор коллекции
        super(c);
    }

// реализация второго альтернативного итератора

    private int[] getIndexes() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        int[] indexes = new int[list.size()];
        int i = 0;
        for (Integer integer : list) {
            indexes[i++] = integer;
        }

        return indexes ;

    }

    public Iterable<T> rand() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    private int[] indexes = getIndexes();
                    private int index = 0;

                    @Override
                    public boolean hasNext() {
                        return (index < size()); // пока index < size() работаем
                    }

                    @Override
                    public T next() {
                        return get(indexes[index++]);  // используем перемешанные индексы
                    }
                };
            }
        };
    }
// реализация альтернативного итератора
    public Iterable<T> rev() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    private int index = size() -1; // size уже реализован в ArrayList
                    @Override
                    public boolean hasNext() {
                        return (index > -1);
                    }
                    @Override
                    public T next() {
                        return get(index--);  // выдать и понизить на 1
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };

    }

}
