package ch10.ex12.include;


/**
 * Created by V1 on 15-Feb-17.
 */
public class Parcel7b {                         // полная реализация анонимного класса
    class MyContents implements IContents {     // реализуется интерфейс IContents в целом нужен только интерфейс
        private int value = 27;  // anonymous

        @Override
        public int getValue() {
            return value;
        }
    }

    public IContents getContents() {
        return new MyContents();
    }
}
