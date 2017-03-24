package ch11.ex03.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 3 SequenceOld Collection Check\n");

        SequenceOld sq = new SequenceOld(25); // на 25 элементов
        sq.newSequence(); // заполнить значениями
        sq.show();
        Sequence sc = new Sequence();
        sc.newSequence(25);
        sc.show();
        sc.newSequence(10);
        sc.show();

    }
}
