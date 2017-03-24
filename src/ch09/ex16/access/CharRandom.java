package ch09.ex16.access;

import java.util.Random;

/**
 * Created by V1 on 14-Feb-17.
 */
public class CharRandom {  // класс с неизменным интерфейсом, генерит 12 символов
    private final char[] chs = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
    private final int NUM_OF_CHAR  = 12;
    private char [] c = new char[NUM_OF_CHAR]; // массив для символов
    private Random rnd = new Random();

    char[] genChars() {
        for (int i = 0; i < NUM_OF_CHAR ; i++) {
          c[i] = chs[rnd.nextInt(chs.length)];
        }
        return c;
    }



}
