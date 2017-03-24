package ch.ex12a;

import ch.ex10.Int;

/**
 * Created by V1 on 04-Feb-17.
 */

public class Ex12a {
    public static void main(String[] args) {

        System.out.println("\nExercise 14");
        System.out.println("\nCharacter toBinary\n");
        char c1 ='U';
        char c2 ='\uF0F1';
        char c3 ='\uF0FF';
        System.out.println("c1:"+c1+" c2:"+c2+" c3:"+c3);

//        System.out.println(Int.toBinaryString((char)1));
        System.out.println(Int.toBinaryString(c1));
        System.out.println(Int.toBinaryString(c2));
        System.out.println(Int.toBinaryString(c3));




    }
}
