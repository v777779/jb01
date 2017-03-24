package ch13.ex04.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 4 Format  Check\n");
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans",4,4.25);
        receipt.print("Princess Peas",3,5.1);
        receipt.print("Three Bears Porridge",1,14.29);
        receipt.printTotal();

    }
}
