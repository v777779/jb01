package ch.ex12.include;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Parcel9 {
    public Contents getContents(final int intValue) {  // это объявление функции пользователя, любые параметры
        return new Contents() {   // конструктор
            private int value = intValue; // инициализируется при создании экземпляра
            @Override
            public int getValue() {      // выдать свое значение
                return value;
            }
        };
    }
}
