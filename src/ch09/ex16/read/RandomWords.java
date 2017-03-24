package ch.ex16.read;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;

/**
 * Created by V1 on 13-Feb-17.
 */
public class RandomWords implements Readable {
    final int LEN_OF_WORD = 15;
    private Random rnd = new Random();   // получили объект
    private int count = 8;               //NUM_OF_WORD;


    @Override
    public int read(CharBuffer cb) throws IOException {  // заполнить буфер символов и вернуть число
        if (count-- == 0) {
            return -1;  // конец входных данных правило read
        }

        for (int i = 0; i < LEN_OF_WORD ; i++) {
            cb.append( Integer.toString(rnd.nextInt(10)) ); // цифру в символ
        }
        cb.append(" ");
        return LEN_OF_WORD+1;  // длина символов массива + " "
    }
}
