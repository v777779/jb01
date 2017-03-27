package ch17.ex01.integra;

import lib.utils.IGenerator;
import lib.utils.Pair;

import java.util.Iterator;

/**
 * Created by V1 on 3/27/2017.
 */
public class Letters implements IGenerator<Pair<Integer, String>>, Iterable<Integer> {
    private int size = 9;       // размер генератора
    private int number = 1;
    private char letter = 'A';

    @Override
    public Pair<Integer, String> next() { // до бесконечности
        return new Pair<>(number++,String.valueOf(letter++));  // ""+letter++  чтобы в строку символ перевести
    }

    @Override
    public Iterator<Integer> iterator() {  // выдает последовательность от 1..9
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number < size;
            }
            @Override
            public Integer next() {
                return number++;
            }
        };
    }
}
