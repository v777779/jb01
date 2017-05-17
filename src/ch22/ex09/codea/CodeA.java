package ch22.ex09.codea;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 16-May-17.
 */
public class CodeA {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nLayouts Check\n");
        System.out.println("BorderLayout");
        BorderLayout1.check();

        System.out.println("\nFlowLayout");
        FlowLayout1.check();

        System.out.println("\nGridLayout");
        GridLayout1.check();

    }
}
