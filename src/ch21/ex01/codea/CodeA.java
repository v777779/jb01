package ch21.ex01.codea;

import lib.utils.Time;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
public class CodeA {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nMulti Thread Execution Check\n");

        System.out.println("LiftOff.run():");
        LiftOff launch = new LiftOff();
        launch.run();  // это просто запуск потока

        System.out.println("\nThread Start:");
        BasicThreads.check();


        System.out.println("\nThread More Start:");
        MoreBasicThreads.check();

        Time.sleep(100);
    }
}
