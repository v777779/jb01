package ch13.ex07.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 7 RegEx Check\n");
        String s = "Look at the picture and fint the new objects.";
        System.out.println(s.matches("(^[A-Z])((\\w+|\\W+)+)(\\.$)"));  // \\. это "."
        System.out.println(s.matches("(\\p{javaUpperCase}.*\\.)"));     // .* повтор любого сколько угодно раз

    }
}
