package ch17.ex30.access.office;

import lib.generate.GenList;
import lib.tests.Test;
import lib.tests.TestParam;
import lib.tests.Tester;

import java.util.List;

/**
 * Created by V1 on 02-Apr-17.
 */
public class ListSortOffice extends Tester<List<Integer>> {
    private List<Test<List<Integer>>> tests;        // объекты тестирования
    private static int sizeWidth = 5;
    private static String sizeField = "%" + sizeWidth + "s";
    private TestParam[] paramList = defaultParams;  // параметры загоняются при создании объекта

    public ListSortOffice(List<Integer> container, List<Test<List<Integer>>> tests) {
        super(container, tests);
    }

    @Override
    protected List<Integer> initialize(int size) {
        container.clear();
        container.addAll(new GenList(size,1000)); // random Integer, 0..1000
        return container;
    }

    // Override не работает т.к. это статический метод класса
    public static void run(List<Integer> list, List<Test<List<Integer>>> tests) {
        System.out.println("run of ListTesterS");
        new ListSortOffice(list, tests).timedTests();  // новый вариант
    }


}
