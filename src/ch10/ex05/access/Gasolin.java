package ch10.ex05.access;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Gasolin {
    public class Oil{
        public Oil() {
            System.out.println("Oil.Constructor");
        }

        void show() {
            System.out.println("Oil.showOil");
        }
    }

    public Gasolin() {
        System.out.println("Gasolin.Constructor");
    }

    void show() {
        System.out.println("Gasolin.show");
    }
}
