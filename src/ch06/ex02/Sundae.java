package ch06.ex02;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Sundae {
    private int i;

    public static Sundae makeSundae() {
        return new Sundae(5); // создать напрямую экземпляр нельзя, только через свой конструктор
    }

    void show() {
        System.out.println("i = " + i);
    }
    private Sundae(int i) {
        this.i = i;
    }

    private Sundae() {  // закрыли доступ к конструктору по умолчанию
    }
}
