package ch19.ex01.coded;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class CodeD {
    public static void app() {
        System.out.println("\n====CODE_D===");
        System.out.println("\nEnum and Switch Check\n");

        TrafficLight tf = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(tf);
            tf.change();

        }

    }
}
