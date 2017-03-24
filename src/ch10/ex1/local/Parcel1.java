package ch10.ex1.local;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Parcel1 {
    public class Contents {  // inner class
        private int value = 11;

        public int getValue() {
            return value;
        }
    }

    public class Destination { // inner class
        private String label;

        public Destination(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }


    public Parcel1() {   // пустой конструктор
    }

    public Contents getContents() {
        return new Contents();
    }

    public Destination getDestination(String label) {
        return new Destination(label);
    }

    public void ship(String dest) {
        Contents c = new Contents();            // используем внутренний класс как обычный
        Destination d = new Destination(dest);  // тоже самое, как обычнй внешний класс
        System.out.println(d.getLabel() + ": " + c.getValue()); // распечатать Label
    }

}
