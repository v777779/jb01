package ch22.ex35.exercise;

import lib.swing.SwingConsole;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 25-May-17.
 */
public class Exercise {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 36 JavaBeans and Intellij GUI Check\n");
        SwingConsole.run(new JavaBeanGUI(),500,500);

    }
}
