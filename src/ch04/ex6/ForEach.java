package ch.ex6;

/**
 * Created by V1 on 05-Feb-17.
 */
public class ForEach {

    static void outChars(String s) {

        for (char c: s.toCharArray()) {
            System.out.print(c+" ");
        }
        System.out.println();
    }

}
