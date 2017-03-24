package ch.ex16.access;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 * Created by V1 on 14-Feb-17.
 */
public class CharAdapter implements Readable{  // класс адаптер с Readable интерфейсом
    CharRandom charRandom = new CharRandom();
    private final int NUM_OF_WORDS = 10;
    private int count = NUM_OF_WORDS;

    @Override
    public int read(CharBuffer cb) throws IOException {  // метод read() для работы со Scanner
        if (count-- == 0) {
            return -1;
        }
        String s =  String.valueOf(charRandom.genChars())+" ";
        cb.append(s);               // символы в строку

        return s.length();
    }
}
