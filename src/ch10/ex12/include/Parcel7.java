package ch.ex12.include;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Parcel7 {
    public Contents getContents() {
        return new Contents(){  // объявление анонимного класса
            private int value = 17; // новое поле нового класса
            @Override
            public int getValue() {  // переопределенный метод возьмет поле анонимного класса
                return value;
            }
        };  // анонимный класс завершен
    }
}
