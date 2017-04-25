package ch20.ex04.codea;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Feb-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nJUnit Check\n");

        System.out.println("ATTENTION:");
        System.out.println("For this exercise Junit4  Libarary Used");
        System.out.println("If you don't have installed this library");
        System.out.println("Please Download and Install junit-4.122.jar and hamcrest-core-1.32.jar packages");
        System.out.println("package: junit-4.122.jar");
        System.out.println("package: hamcrest-core-1.32.jar");


        System.out.println("\nAtUnitExample1:");
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(AtUnitExample1.class);
        System.out.println("run tests     :" + result.getRunCount());
        System.out.println("failed tests  :" + result.getFailureCount());
        System.out.println("ignored tests :" + result.getIgnoreCount());
        System.out.println("succeded tests:" + result.wasSuccessful());
        System.out.println("\nMathFuncTest:");
        result = runner.run(MathFuncTest.class);
        System.out.println("run tests     :" + result.getRunCount());
        System.out.println("failed tests  :" + result.getFailureCount());
        System.out.println("ignored tests :" + result.getIgnoreCount());
        System.out.println("succeded tests:" + result.wasSuccessful());

    }
}
