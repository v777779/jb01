package ch15.ex07.integra;

import java.util.Iterator;

/**
 * Created by V1 on 15.03.2017.
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{
private int size;

    public IterableFibonacci(int size) {
        this.size = size;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {  // крутим пока не переберем все элементы
                return (size > 0);
            }
            @Override
            public Integer next() {
                size--; // получить следующий элемент
                return IterableFibonacci.this.next();  // выходим на внешний класс,
            }                                           // по умолчанию подтягиваются функции предка
        };
    }
}
