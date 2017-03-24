package ch.ex25.local;

/**
 * Created by V1 on 17-Feb-17.
 */
public class CallTwo extends MyIncrement {
    private int value = 0;

    public void increment() {
        super.increment();
        value++;
        System.out.print("CallTwo.increment." + value + " > ");
    }

    public void decrement() {
        value--;
        System.out.print("CallTwo.decrement." + value + " > ");
    }

    private class Closure implements Incrementable { //никакой рекурсии
        @Override
        public void increment() {
            System.out.print("CallTwo.Closure.increment > ");
            CallTwo.this.increment();       // вызываем переопределенную CallTwo
        }
    }

    public Incrementable getCallBack() {    // вызываем внутренний класс как объект из объекта внешнего класса
        return new Closure();               // closure  пример получаем замыкание
    }

    public Incrementable getI() {           // это просто внутренний класс
        return new Incrementable() {        // closure  пример получаем замыкание
            @Override
            public void increment() {
                System.out.print("CallTwo.Incrementable.increment > ");
                CallTwo.this.increment();
                CallTwo.this.decrement();
                CallTwo.super.decrement();
                CallTwo.super.increment();

            }
        };
    }

// ---- static context ----
//
    private static class Closure2 implements Incrementable { //никакой рекурсии
        @Override
        public void increment() {
            System.out.print("CallTwo.Closure.increment > ");
//          CallTwo.this.increment();               // не работает в static context
        }
    }

    public static Incrementable getCallBack2() {    // создаем объект внутреннего класса из static контекста
//      return new Closure();                       // не работает так как класс Closure non static
        return new Closure2();                      // работает так как класс Closure2 static
    }

    public static Incrementable getIStatic() {      // это просто внутренний класс
        return new Incrementable() {                // closure  пример получаем замыкание
            @Override
            public void increment() {
                System.out.print("CallTwo.Incrementble.increment static");
//              CallTwo.this.increment();          // в static версии это не работает, нет экземпляра
            }
        };
    }
}
