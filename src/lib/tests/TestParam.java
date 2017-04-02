package lib.tests;

/**
 * Created by V1 on 01-Apr-17.
 */
public class TestParam {
    public final int size;
    public final int loops;

    public TestParam(int size, int loops) {
        this.size = size;
        this.loops = loops;
    }

    public static TestParam[] array(int... values){  // массив аргументов size,int переменной длины
        int size = values.length/2;
        TestParam[] testParams = new TestParam[size]; // массив длинной в 2 раза меньше аргументов
        int n = 0;
        for (int i = 0; i < testParams.length ; i++) {
            testParams[i] = new TestParam(values[n++],values[n++]); // входные пары аргументов size,int
        }
        return testParams;
    }

    public static TestParam[] array(String[] strings){  // массив аргументов size,int переменной длины
        int[] values = new int[strings.length];

        for (int i = 0; i < values.length ; i++) {
            values[i] = Integer.decode(strings[i]); // decode принимает signed  Octal, Hex, Deciaml
        }
        return array(values);
    }
}
