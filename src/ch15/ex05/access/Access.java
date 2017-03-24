package ch15.ex05.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 5 Stack Generic Check\n");
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on Stun!".split(" ")) {
            lss.push(s);
        }
        while (!lss.empty()) {
            System.out.println(lss.pop());
        }

    }
}
