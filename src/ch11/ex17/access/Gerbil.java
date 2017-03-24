package ch11.ex17.access;

import java.util.Random;

/**
 * Created by V1 on 19-Feb-17.
 */
public class Gerbil {
    private final static String charsSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int gerbilNumber;
    private static Random rnd = new Random();

    private static char getChar(int len) {
        return charsSet.charAt(rnd.nextInt(len)); // символ из строки
    }
    public static String getName(int size) {  // длина 6 символов
        String s = "";
        for (int i = 0; i < size; i++) {
            s +=getChar(charsSet.length()/2); // только мелкие буквы
        }
        return s;
    }

    public static int getNumber() {
        return rnd.nextInt(100);  // от 0 до 99
    }

    public Gerbil() {
        gerbilNumber = rnd.nextInt(100);  // от 0 до 99
    }

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public String hop() {
        return(this.toString());

    }

    @Override
    public String toString() {
        return String.format("Gerbil{%d}",gerbilNumber);
    }
}
