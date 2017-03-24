package ch.ex16.adapter;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 * Created by V1 on 14-Feb-17.
 */
public class DoubleAdapter extends DoubleRandom implements Readable {
    private int count = 0;  // число строковых слов
    private final int NUM_WORDS =  10;

    public DoubleAdapter() {
        this.count = NUM_WORDS;
    }

    public DoubleAdapter(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;  // выход если слова закончились
        }

        String s = String.format("%8.6f", DoubleRandom.next())+" "; // используем базовый класс как источник данных
        cb.append(s);  // возвращаем значение в read метод для Scanner
        return s.length();   // число символов
    }
}
