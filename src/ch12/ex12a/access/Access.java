package ch12.ex12a.access;

import lib.except.ExBall;
import lib.except.ExJump;
import lib.except.ExMove;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static void f() throws ExBall, ExMove, ExJump {
        int ex = new Random().nextInt(10);
        switch (ex) {
            default:
            case 1:
                throw new ExBall();
            case 2:
                throw new ExMove();
            case 3:
                throw new ExJump();
            case 4:
                List list = new ArrayList();
                list = null;
                list.add("");
        }
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 12a Finally vs NullPointerException Check\n");
        Switch sw = new Switch();

        for (int i = 0; i < 5; i++) {
            System.out.println("-------");
            try {
                sw.on();
                f();
            } catch (Exception e) {
                System.out.println("catched: "+e.getClass().getSimpleName());
            }finally {
                sw.off();
            }
        }
        System.out.println("\n..done");

    }
}
