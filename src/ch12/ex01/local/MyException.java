package ch12.ex01.local;

/**
 * Created by V1 on 01-Mar-17.
 */
public class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
