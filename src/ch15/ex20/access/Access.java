package ch.ex20.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 20 Generic Erasure Type Check\n");
        Accounter ac = new Accounter();
        ac.setcount();
        ac.getcount();
        ac.getbalance();

        Auditor.makeAudit(ac);  // передали обобщенному методу экземпляр реализующего класса
    }
}
