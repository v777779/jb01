package ch22.ex05.codea;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 15-May-17.
 */
public class CodeA {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nJButton, Listener and JTextField Check\n");
        Button2.check();
        Button2b.check();  // with anonimous  class listener
    }
}
