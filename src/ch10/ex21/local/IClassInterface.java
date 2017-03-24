package ch.ex21.local;

/**
 * Created by V1 on 16-Feb-17.
 */
public interface IClassInterface { // основной интерфейс с вложенным классом внутри
    void howdo();

    static IClassInterface getTest(String s) {  // static метод создает экземпляр класса Test через интерфейс
        return new Test(s);
    }
    static ITest getTest() {                    // static метод создает экземпляр класса Test2 через интерфейс
        return new Test2();
    }

     class Test implements IClassInterface {     // вложенный класс внутри интерфейса
        private String s;
        public Test(String s) {
            this.s = s;
        }

        public void show() {                        // метод оригинальный класса
            System.out.print("Test.show $ ");
            System.out.println("String s. " + s);
        }

        @Override
        public void howdo() {                   // метод интерфейса IClassInterface
            System.out.print("Test.howdo $ ");
            System.out.println("String s. "+s);

        }
    }

    class Test2 implements ITest {          // вложенный класс 2 внутри интерфейса
        public Test2() {
            System.out.println("Test2.Constructor");
        }

        @Override
        public void howdo() {                   // метод интерфейса ITest
            System.out.println("Test2.howdo");
        }

        @Override
        public ITest getInst() {                // метод выдает текущий экземпляр
            return this;
        }

        public static  ITest getTest() {        //static метод создает новый экземпляр
            return new Test2();
        }

        public void show() {                    // метод оригинальный класса 2
            System.out.println("Test2.***show***");
        }

    }

    class Main {                                // static вложенный класс для тестирования main() работает
        public static void main(String[] args) {
            System.out.println("Test Main inside Interface");
        }
    }


}
