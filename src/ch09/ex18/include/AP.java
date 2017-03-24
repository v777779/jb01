package ch09.ex18.include;

import ch09.ex18.local.A;
import ch09.ex18.local.E;

/**
 * Created by V1 on 14-Feb-17.
 */
public class AP extends A implements A.IBPublic, E.IGPublic {  // работает только с public за пределами пакета
    @Override
    public void f() { }                             // обычный класс вложенный интерфейс другой пакет
    class A2 implements A.IBProtected {             // вложенный класс вложенный интерфейс другой пакет
        @Override
        public void f() { }
    }
    A a = new A(); // экземпляр класса из другого пакета
    A.CPublic ac = new A.CPublic();  // по наследованию прокатывает
}
