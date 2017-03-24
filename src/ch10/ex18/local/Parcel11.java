package ch.ex18.local;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Parcel11 {
    private static class ParcelCont implements IContents {   // статический вложенный класс
        private int value =15;
        @Override
        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "ParcelCont{" +
                    "value=" + value +
                    '}';
        }
    } // static ParcelCont
    private static class ParcelDest implements IDestination { // статический вложенный класс
        private String label;

        public ParcelDest(String label) {
            this.label = label;
        }

        @Override
        public String getLabel() {
            return label;
        }
// static members
        public static int valueX = 17;
        public static void f() {
        }
        static class EntryLevel {
            public static int valueY = 25;
            public static void g(){}

            @Override
            public String toString() {
                return "EntryLevel{}";
            }
        }

        @Override
        public IEntry getEntry() {  // пока просто заглушка
            return null;
        }

        @Override
        public String toString() {
            return "ParcelDest{" +
                    "label='" + label + '\'' +
                    '}';
        }
    } // static ParcelDest

    public static IDestination getClassDest(String s) {
        return new ParcelDest(s);
    }

    public static IContents getClassCont() {
        return new ParcelCont();
    }


}
