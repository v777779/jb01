package ch07.ex15;

import ch07.ex15.local.Villian;
import ch07.ex15.local2.Orc;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Ex15 {
    public static void main(String[] args) {
        System.out.println("\nProtected Check\n");
        Villian villian = new Villian("dataPath");
        System.out.println("villian = " + villian);
//        villian.set("NewPath"); // не работает
        System.out.println("villian = " + villian);

        Orc orc = new Orc("Lumburger", 27);
        System.out.println("\norc = " + orc);
        orc.change("NewYork",32);
        System.out.println("orc = " + orc);


    }
}
