package ch10.ex28.remote;

/**
 * Created by V1 on 17-Feb-17.
 */
public class LocalClass {
    private int count = 0;  // закрытая переменная класса

    ICounter getCountInner(String nameCounter) {  // метод реализует интерфейс через локальный класс

        class InnerClass implements ICounter {
            public InnerClass() {
                System.out.println("InnerClass.Constructor");
            }

            @Override
            public int next() {
                System.out.println(nameCounter + ". " + ++count);  // распечатать значение
                return count;
            }
        } // локальный класс
        return new InnerClass();
    } // метод

    ICounter getCountAnonim(String nameCounter) {  // метод реализует интерфейc через анонимный класс
        return new ICounter() {
            @Override
            public int next() {
                System.out.println(nameCounter + "." + ++count);  // распечатать значение
                return count;
            }
        };  // анонимный клас
    } // метод
}
