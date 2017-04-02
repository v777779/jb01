package ch17.ex30.access;

import lib.tests.Test;
import lib.tests.TestParam;
import lib.tests.Tester;

import java.util.List;

/**
 * Created by V1 on 02-Apr-17.
 */
public class ListSort extends Tester<List<Integer>> {
    private List<Test<List<Integer>>> tests;        // объекты тестирования
    private static int sizeWidth = 5;
    private static String sizeField = "%" + sizeWidth + "s";
    private TestParam[] paramList = defaultParams;  // параметры загоняются при создании объекта

    public ListSort(List<Integer> container, List<Test<List<Integer>>> tests) {
        super(container, tests);
        this.container = container;
        this.tests = tests;
    }
    private static String numberField() {  // формат поля %8d
        return "%" + fieldWidth + "d";
    }


    @Override
    public void timedTests() {
        displayHeader();
        for (TestParam param : paramList) {
            System.out.printf(sizeField, param.size);
            long[] timePerRep = {0,0};
            int index = 0;
            for (Test<List<Integer>> test : tests) {
                List<Integer> container = initialize(param.size);
                long start = System.nanoTime(); // системное время в наносекундах
                int repeats = test.test(container, param);
                long duration = System.nanoTime() - start;
                if(index < 2) {
                    timePerRep[index] = duration / repeats;
                    System.out.printf(numberField(), timePerRep[index]); // разница и будет sort
                }
                else {
                    System.out.printf(numberField(), timePerRep[1]-timePerRep[0]); // разница и будет sort
                }
                index++;
            }
//            System.out.printf("(%d/%d)", timePerRep[1],timePerRep[0]);     // add/add+sort
            System.out.println();
        }
    }

    // Override не работает т.к. это статический метод класса
    public static void run(List<Integer> list, List<Test<List<Integer>>> tests) {
        System.out.println("run of ListTesterS");
        new ListSort(list, tests).timedTests();  // новый вариант
    }


}
