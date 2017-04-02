package lib.tests;

/**
 * Created by V1 on 01-Apr-17.
 */
abstract public class Test<C> {
    String name;

    public Test(String name) {  // класс для различных тество
        this.name = name;
    }

    abstract public int test(C container, TestParam tp); // возвращает фактически пройденные тесты

}
