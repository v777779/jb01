package ch13.ex03.integra;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nFormatter Class Check\n");
        PrintStream outAlias = System.out;
        Turtle tommy = new Turtle("Tommy",new Formatter(System.out));  // выдает в System.out
        Turtle terry = new Turtle("Terry",new Formatter(outAlias));// выдает в System.out через PrintStream Object
        tommy.move(0,0);
        terry.move(4,3);
        tommy.move(3,4);
        terry.move(2,5);
        tommy.move(3,3);
        terry.move(3,3);

    }
}
