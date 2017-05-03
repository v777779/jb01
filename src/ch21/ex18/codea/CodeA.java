package ch21.ex18.codea;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 03-May-17.
 */
public class CodeA {
    public static void main(String[] args) {
        app(1);
    }

    public static void app(int... value) {
        System.out.println("\n====CODE_A===");
        System.out.println("\nInterrupt Check\n");
        if (value.length > 0) {
            Interrupting.check();
        }
        System.out.println("Please call CodeA via  RMB >> Run CodeA.main()...");

    }
}
