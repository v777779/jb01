package ch.ex3;

import java.util.Random;

/**
 * Created by V1 on 04-Feb-17.
 */
public class Ex3 {

    public static void main(String[] args) {
        Random rnd  = new Random();
        int i = rnd.nextInt(100); // 0..99
        int j = 1;
        while (j++ > 0) {
            Comp.rand(i,j,rnd.nextInt(100));
        }

    }
}
