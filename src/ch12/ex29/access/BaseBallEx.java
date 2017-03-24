package ch12.ex29.access;

/**
 * Created by V1 on 03-Mar-17.
 */
public class BaseBallEx extends RuntimeException{   // ВНИМАНИЕ. RuntimeExeption наследование Exception не ограничено
    public BaseBallEx() {
    }

    public BaseBallEx(String message) {
        super(message);
    }
}
