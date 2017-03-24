package ch.ex17.access;

/**
 * Created by V1 on 14-Feb-17.
 */
public class GenClass {
    private static int value = 127;
    public static void setValue(int input) {
        value = input;  // инициализируем статическое значение класса
    }
    public static int genValue() {  // автоматом наращиваем
        System.out.println("GenClass.genValue");
        return value++;
    }
    public static int genValue20() {
        return 10;
    }
}
