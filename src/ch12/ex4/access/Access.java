package ch12.ex4.access;

import ch12.ex4.CException;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 4 Custom Exception Check\n");

        try {
            throw new CException("Message:Custom Exception CException.class");
        } catch (CException e) {
            System.out.println(e);  // toString
            e.showMessage();        // showMessage
            System.out.println(e.getMessage());  // super.getMessage
        }

    }
}
