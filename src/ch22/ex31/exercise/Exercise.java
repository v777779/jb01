package ch22.ex31.exercise;

import ch22.ex31.exercise.office.ProgressOffice;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 23-May-17.
 */
public class Exercise {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 31 JProgressBar Check\n");
        System.out.println("JSlider Progress:");
        ProgressAsimpt.check();
        System.out.println("\nJSlider Timer Progress:");
        ProgressAsimptT.check();


        System.out.println("\nOfficial solution:");
        System.out.println("Timer Progress:");
        ProgressOffice.check();
    }
}
