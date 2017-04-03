package lib.tests;

import java.util.List;

/**
 * Created by V1 on 01-Apr-17.
 */
public class Tester<C> { // класс тестировщик
    public static int fieldWidth = 8;
    public static TestParam[] defaultParams = TestParam.array(
            10, 5000, 100, 5000, 1000, 5000, 10000, 500  // [size,loops]
    );

    protected C container;
    private String headLine = "";       // класс контейнера
    private List<Test<C>> tests;        // объекты тестирования
    private static int sizeWidth = 5;
    private static String sizeField = "%" + sizeWidth + "s";
    private TestParam[] paramList = defaultParams;  // параметры загоняются при создании объекта

    protected C initialize(int size) {  // переопределить при необходимости
        return container;
    }

    private static String stringField() {  // формат поля %8s
        return "%" + fieldWidth + "s";
    }

    private static String numberField() {  // формат поля %8d
        return "%" + fieldWidth + "d";
    }

    public Tester(C container, List<Test<C>> tests) {
        this.container = container;
        this.tests = tests;
        if (container != null) {
            headLine = container.getClass().getSimpleName();
        }
    }
    public Tester(C container, List<Test<C>> tests, TestParam[] paramList) {
        this.container = container;
        this.tests = tests;
        this.paramList = paramList;
        if (container != null) {
            headLine = container.getClass().getSimpleName();
        }
    }
    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }


    public void displayHeader() {
        int width = fieldWidth*tests.size()+sizeWidth;  // ширина полей
        int dashLength = width - headLine.length() - 1; //
        StringBuilder head = new StringBuilder();
        for (int i = 0; i < dashLength/2; i++) {  //нарисовать прочерк
            head.append('-');
        }
        head.append(' ');
        head.append(headLine);
        head.append(' ');
        for (int i = 0; i < dashLength/2; i++) {  //нарисовать прочерк
            head.append('-');
        }
        System.out.println(head);
        System.out.printf(sizeField,"size");
        for (Test<C> test : tests) {
            System.out.printf(stringField(),test.name);  // вывести имена тестов в строку
        }
        System.out.println();
    }

    public void timedTests() {
        displayHeader();
        for (TestParam param : paramList) {
            System.out.printf(sizeField,param.size);
            for (Test<C> test : tests) {
                C container = initialize(param.size);
                long start = System.nanoTime(); // системное время в наносекундах
                int repeats = test.test(container,param);
                long duration = System.nanoTime() - start;
                long timePerRep = duration /repeats;
                System.out.printf(numberField(),timePerRep);
            }
            System.out.println();
        }
    }

    public static <C> void run(C container, List<Test<C>> tests, TestParam[] paramList) {  // создать класс тестировщик и запустить метод
//        System.out.println("run of Tester 2");
        new Tester<C>(container,tests, paramList).timedTests();
    }

    public static <C> void run(C container, List<Test<C>> tests) {  // создать класс тестировщик и запустить метод
//        System.out.println("run of Tester");
        new Tester<C>(container,tests).timedTests();
    }

}
