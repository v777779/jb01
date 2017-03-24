package ch11.ex01.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Apple {  // объект хранения
    private static long counter;
    private final long appleId = counter++;  // автоиндентификация при создании объектов
    long getId() {
        return appleId;
    }
}
