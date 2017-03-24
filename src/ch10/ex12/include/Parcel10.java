package ch10.ex12.include;

import java.util.Random;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Parcel10 {
    public Contents getContents(int intValue) {  // это объявление функции пользователя
        return new Contents() {                   // конструктор базового класса
            private int value = intValue;         // final значение по любому

            {                                     // блок работает как конструктор
                int rnd1 = new Random().nextInt(100);
                int rnd2 = new Random().nextInt(100);

                System.out.println("Parcel10.instance initializer." + value + " " + rnd1+" "+rnd2);

                if (rnd1 > rnd2) {                // ставим наименьшее
                    rnd1 = rnd2;                  // такое может только конструктор
                }
                this.value += rnd1;
            }

            @Override
            public int getValue() {               // выдать свое значение
                System.out.println("Parcel10.getValue");
                return value;
            }
        };
    }
}
