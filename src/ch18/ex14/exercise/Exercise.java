package ch18.ex14.exercise;

import lib.tests.TestParam;
import lib.tests.Tester;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 14 BufferedFileWrite Performance Check\n");

//       List<String> list = new GenList(new GenRnd.GenStr(4),10);

       Tester.run(null, new BFileCheck().tests, TestParam.array(10,10)); // size значения не имеет

    }
}
