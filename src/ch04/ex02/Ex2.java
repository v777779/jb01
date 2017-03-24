package ch04.ex02;

import java.util.Random;

/**
 * Created by V1 on 04-Feb-17.
 */
public class Ex2 {
    public static void main(String[] args) {
        Random rnd  = new Random();
        int i = rnd.nextInt(100); // 0..99
        int j = 0;
        while (j++ < 25 ) {
            Comp.rand(i,j,rnd.nextInt(100));
        }

    }
}
