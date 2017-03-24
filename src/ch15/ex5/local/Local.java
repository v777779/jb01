   package ch.ex5.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nStack with Generic Check\n");
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on Stun!".split(" ")) {
            lss.push(s);
        }
        while (!lss.empty()) {
            System.out.println(lss.pop());
        }


    }
}
