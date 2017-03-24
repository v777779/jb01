package ch12.ex01.local;

/**
 * Created by V1 on 01-Mar-17.
 */
public class ClassWithException {       // класс методы которого порождают Exception
    public void f() throws SimpleException {
        System.out.print("f() calls SimpleException > ");
        throw new SimpleException();    // нет сообщения, т.к. конструктор default
    }
    public void g() throws MyException {
        System.out.print("g() calls MyException     > ");
        throw new MyException("MyException Message");    // нет сообщения, т.к. конструктор default
    }

}
