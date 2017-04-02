package ch17.ex29.local;

import lib.generate.Gen;
import lib.generate.GenRnd;
import lib.tests.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void get(int... values) {
        System.out.println(values.length);
    }

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nTest List Check\n");

        // запуск своих тестов
        // контейнера внешнего нет, но переопределен метод init
        System.out.println("Low Level Tester:");

        Tester<List<Integer>> tester =  // один  объект
                new Tester<List<Integer>>(null, ListCheck.tests.subList(1,3)){  // оставлены методы get,set
                    @Override
                    protected List<Integer> initialize(int size) {  // создать массив
                        Integer[] array = Gen.getArray(new Integer[size],new GenRnd.GenInt(100));
                        return Arrays.asList(array); // по массиву сделать List и вернуть его
                    }
                };
        tester.setHeadLine("Array as List:");
        tester.timedTests();

        System.out.println("\nHigh Level Tester:");
        Tester.defaultParams = TestParam.array(
                10,5000,100,5000,1000,1000,10000,200
        );

        ListTester.run(new ArrayList<Integer>(),ListCheck.tests);  // параметры прописались
        ListTester.run(new LinkedList<Integer>(),ListCheck.tests);  // параметры прописались
        Tester.fieldWidth = 12; // для очередей
        Tester<LinkedList<Integer>> qTest = new Tester<>(new LinkedList<>(), QueueCheck.tests); // fieldWidth=12 ok
        qTest.setHeadLine("Queue tests");
        qTest.timedTests();



    }
}
