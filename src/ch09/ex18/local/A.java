package ch.ex18.local;

/**
 * Created by V1 on 14-Feb-17.
 */
public class A {
    interface IBDefault {                         // внутри класса активно в пределах пакета
        void f();
    }

    protected interface IBProtected {                         // внутри класса активно в пределах пакета
        void f();
    }

    public interface IBPublic {                         // внутри класса активно в пределах пакета
        void f();
    }

    private interface IBPrivate {  // private interface
        void f();
    }

    public class BPublic implements IBDefault {   // вложенный public класс работает только внутри класса А
        @Override
        public void f() { }
    }
    private class BPrivate implements IBDefault {  // вложенный private class  работает только  внутри класса A
        @Override
        public void f() { }
    }

    public class CPublic implements IBPublic {
        @Override
        public void f() { }
    }

    class CDefault implements IBPublic {
        @Override
        public void f() { }
    }

    private class CPrivate implements IBPublic {
        @Override
        public void f() { }
    }

    private class DPrivate implements IBPrivate {
        @Override
        public void f() { }
    }

    public class DPublic implements IBPrivate {
        @Override
        public void f() { }
    }
    public IBPrivate getD() {    // возвращает private Interface объекта Private класса
        return new DPrivate();   // IBPrivate DPrivate()
    }
    private IBPrivate dRef; // ссылка на интерфейс


    public void receiveD(IBPrivate dRef) {   // встроенная функция нормально работает с private interface
        this.dRef = dRef;
        this.dRef.f();
    }

    public void check() {

      A.IBPublic ab = new A.CPublic();  // не прокатывает вне класса A
      A.CPublic ac = new A.CPublic();   // не прокатывает вне класса  A
      A a = new A();
      a.getD().f();                    // все прокатывает внутри класса
      a.receiveD(a.getD());            // все прокатило из другого пакета
    }





}
