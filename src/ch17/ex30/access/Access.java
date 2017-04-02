package ch17.ex30.access;

import lib.generate.GenList;
import lib.tests.ListCheck;
import lib.tests.Test;
import lib.tests.TestParam;
import lib.tests.Tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 30 Collection.sort() Check\n");
        Tester.defaultParams = TestParam.array(
                10,5000,100,5000,1000,1000,10000,200
        );

        ListCheck.tests.add(new Test<List<Integer>>("addAll") {  // имя теста "addAll"
                                @Override
                                public int test(List<Integer> list, TestParam tp) {  // внешний List<Integer>
                                    int loops = tp.loops;
                                    int size = tp.size;
                                    for (int i = 0; i < loops; i++) {
                                        list.clear();
                                        list.addAll(new GenList(size));
                                    }
                                    return loops;
                                } // test()
                            }//new Test{}
        );

        ListCheck.tests.add(new Test<List<Integer>>("sortAdd") {  // имя теста "sort"
                                @Override
                                public int test(List<Integer> list, TestParam tp) {  // внешний List<Integer>
                                    int loops = tp.loops;
                                    int size = tp.size;
                                    for (int i = 0; i < loops; i++) {
                                        list.clear();
                                        list.addAll(new GenList(size));
                                        Collections.sort(list);
                                    }
                                    return loops;
                                } // test()
                            }//new Test{}
        );

        ListCheck.tests.add(new Test<List<Integer>>("sort") {  // имя теста "sort"
                                @Override
                                public int test(List<Integer> list, TestParam tp) {  // внешний List<Integer>
                                    return 0;
                                } // test()
                            }//new Test{}
        );
        int testSize = ListCheck.tests.size();
        Tester.fieldWidth = 12;
        ListSort.run(new ArrayList<Integer>(), ListCheck.tests.subList(testSize-3,testSize)); // последние два теста

    }
}
