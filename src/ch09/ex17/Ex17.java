package ch09.ex17;

import ch09.ex17.access.InterPackage;
import ch09.ex17.access.UserClass;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Ex17 {
    public static void main(String[] args) {
        System.out.println("\nExercise 17 Interface Check\n");
        System.out.println(Inter.VALUE);             // public static
        System.out.println(InterPackage.VALUE_PKG);  // public static
//        Inter.VALUE = 15; // не работает public static final

        InterPackage u = new UserClass();
        InterPackage u2 = new UserClass();
        System.out.println(u+" "+u2+" "+InterPackage.INTERFACE_ID+" "+InterPackage.VALUE_RND);


    }
}
