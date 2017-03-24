package ch08.ex11;

import ch08.ex11.access.Insect;
import ch08.ex11.access.Wing;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Ex11a {
    public static void main(String[] args) {
        System.out.println("\nClass Init Sequence Check\n");
        Insect insect = new Wing();

//        System.out.println("\nClass Init Sequence Check\n");
//        Insect2 insect2 = new Wing2(); // полиморфизм
//        System.out.println(insect2);
    }
}
