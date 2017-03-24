package ch14.ex25.integra.pkg;

/**
 * Created by V1 on 13-Mar-17.
 */
public class HiddenC {
    public static A makeA() {  // получить экземпляр С статическим методом
        return new C();
    }

    public static  A makeAnonimA() {
        return AnonimA.makeA();
    }
}
