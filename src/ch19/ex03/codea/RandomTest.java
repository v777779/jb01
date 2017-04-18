package ch19.ex03.codea;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class RandomTest {
    public static  void check() {
        System.out.println("Random Test:");
        for (int i = 0; i < 20 ; i++) {
            System.out.print(Enums.random(Activity.class)+" ");
        }
        System.out.println();
        System.out.println("\nRandom Test2:");
        for (int i = 0; i < 10 ; i++) {
            System.out.print(Enums.random2(Activity.class)+" ");
        }
        System.out.println();
    }
}
