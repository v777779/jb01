package ch12.ex09.include;

import lib.utils.Time;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nThrowable Methods Check\n");
        Time.sleep();
        try {
            throw new Exception("MyException");

        } catch (Exception e) {
            System.err.println("Catch called");
            System.err.println("getMessage()         :"+e.getMessage());
            System.err.println("getLocalizedMessage():"+ e.getLocalizedMessage());
            System.err.println("toString             :"+e);
            System.err.println("printStackTrace()    :");
            e.printStackTrace();
        }
        Time.sleep();
    }
}
