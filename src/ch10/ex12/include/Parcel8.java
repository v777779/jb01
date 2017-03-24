package ch.ex12.include;


/**
 * Created by V1 on 15-Feb-17.
 */
public class Parcel8 {                         // полная реализация анонимного класса
    public Wrapper getWrapper(int value) {
//      return new Wrapper();    // вызов стандартного класса

        return new Wrapper() {   // вызов анонимного класса
            @Override
            public int getValue() {
                return super.getValue()*17;  // используется значение базового класса
            }
        }; // анонимный класс завершен

    } // функция заврешена
}
