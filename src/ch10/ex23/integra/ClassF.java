package ch.ex23.integra;

/**
 * Created by V1 on 16-Feb-17.
 */
public class ClassF extends ClassD {  // обычный класс D наследуется стандартным классом для работы по интерфейсу D

    public ClassE getE() {
        return new ClassE() {         // абстрактный класс  наследуется анонимный классом для работы по интерфейсу E
            public void show() {
                System.out.println("ClassF.show");
            }
        };
    }
}
