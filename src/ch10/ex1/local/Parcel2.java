package ch10.ex1.local;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Parcel2 {
    public static class Contents {  // inner class
        private int value = 11;

        public int getValue() {
            return value;
        }

        public Contents() {
        }

        public Contents(int value) {
            this.value = value;
        }
    }

    public static class Destination { // inner class
        private String label;

        public Destination(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }



    public Parcel2() {   // пустой конструктор
    }

    public static Contents getContents() {
        return new Contents();
    }
    public static Contents getContents(int value) {
        return new Contents(value);
    }

    public static Destination getDestination(String label) {
        return new Destination(label);
    }



    public void ship(String dest) {
        Contents c = new Contents();            // используем внутренний класс как обычный
        Destination d = new Destination(dest);  // тоже самое, как обычнй внешний класс
        System.out.println(d.getLabel()+" contents:"+c.getValue()); // распечатать Label
    }

}
