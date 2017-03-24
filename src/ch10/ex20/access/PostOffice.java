package ch.ex20.access;

/**
 * Created by V1 on 15-Feb-17.
 */
public class PostOffice {
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
            System.out.println("ParcelDest.f");
        }

        private static class EntryLevel implements IEntry{  // вложенный класс
            private static int valueY = 25;
            public void g(){
                System.out.println("Func.g.ValueY."+valueY);
            }

            @Override
            public String toString() {
                return "EntryLevel{" + "valueY=" + valueY +  '}';
            }
        }

        @Override
        public IEntry getEntry() {  // создать экземпляр
            return new EntryLevel();
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

    public static IEntry getClassEntry() {
        return (new ParcelDest("")).getEntry();
    }




}
