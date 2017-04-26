package ch20.ex04.codea;

import lib.units.atunit.AtUnit;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Feb-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nJUnit Check\n");


        System.out.println("\nAtUnitTest Result:");

//          OSExecute.command("java  -cp out\\production\\bookcode  net.mindview.atunit.AtUnit  out\\production\\jb01\\ch20.ex04.codea.AtUnitExample1" );
        try {
            AtUnit.main(new String[]{"out\\production\\jb01\\ch20\\ex04\\codea\\AtUnitExample1"});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        System.out.println("\nAtUnitExample1:");
//        JUnitCore runner = new JUnitCore();
//        Result result = runner.run(AtUnitExample1.class);
//        System.out.println("run tests     :" + result.getRunCount());
//        System.out.println("failed tests  :" + result.getFailureCount());
//        System.out.println("ignored tests :" + result.getIgnoreCount());
//        System.out.println("succeded tests:" + result.wasSuccessful());
//        System.out.println("\nMathFuncTest:");
//        result = runner.run(MathFuncTest.class);
//        System.out.println("run tests     :" + result.getRunCount());
//        System.out.println("failed tests  :" + result.getFailureCount());
//        System.out.println("ignored tests :" + result.getIgnoreCount());
//        System.out.println("succeded tests:" + result.wasSuccessful());

    }
}
