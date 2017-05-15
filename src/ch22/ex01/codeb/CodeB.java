package ch22.ex01.codeb;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 15-May-17.
 */
public class CodeB {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\nSwingUtilities.invokeLater(). Check\n");
        System.out.println("JFrame and Thread");
        SubmitManipulationTask.check();

        System.out.println("JFrame, main() Thread");
        SubmitSwingProgramm.check();

    }
}
