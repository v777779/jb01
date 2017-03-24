package ch07.ex1;

import ch07.ex1.local.Cup;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Plate {
    Cup cup = new Cup();
    Cup cup1, cup2;

    int i = 2;
    String s = "This is a Plate";

    void show() {
        System.out.println(s);
        System.out.print("SubClass info: ");
        cup.getShow();
    }


    @Override
    public String toString() {
        if (cup1 == null) {
            cup1 = new Cup(2);

        }
        if (cup2 == null) {
            cup2 = new Cup(3);
        }

        return (s + " \n"+
                "cup1 = " + cup1 + " \n" +
                "cup2 = " + cup2 + " \n" +
                "i = " + i
        );
    }


}
