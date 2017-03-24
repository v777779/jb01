package ch12.ex9.local;

import lib.utils.Time;

import java.net.UnknownHostException;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nThrowable Methods Check\n");
        Time.sleep();
        try {
            throw new UnknownHostException("Exception_Message_Check");
        } catch (Exception e) {
            System.err.println("==printStackTrace():====");
            e.printStackTrace();
            System.err.println("==fillStackTrace():====");
            e.fillInStackTrace().printStackTrace();
            System.err.println("==toString()               > "+e);
            System.err.println("==getMessage()             > "+ e.getMessage());
            System.err.println("==getLocalizedMessage()    > "+ e.getLocalizedMessage());
            System.err.println("==getClass()               > "+ e.getClass());
            System.err.println("==getClass().getSimpleName > "+ e.getClass().getSimpleName());
        }
        Time.sleep();

    }
}
