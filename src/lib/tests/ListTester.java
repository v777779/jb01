package lib.tests;

import lib.generate.GenList;

import java.util.List;

/**
 * Created by V1 on 02-Apr-17.
 */
public class ListTester extends Tester<List<Integer>> {

    public ListTester(List<Integer> container, List<Test<List<Integer>>> tests) {
        super(container, tests);
    }

    @Override
    protected List<Integer> initialize(int size) {   // переопределить container
        container.clear();
        container.addAll(new GenList(size)); // создать список со значениями
        return container;
    }

    // Override не работает т.к. это статический метод класса
    public static void run(List<Integer> list, List<Test<List<Integer>>> tests) {
        System.out.println("run of ListTesterS");
        new ListTester(list, tests).timedTests();
    }


}
