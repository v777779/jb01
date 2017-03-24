package ch13.ex09.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 9 RegEx Check\n");
        String s = "Then, when you have found the shrubbery, you must " +
                "cut down the mightiest tree in the forest... " +
                "with... a herring!";
        System.out.println(s);
        System.out.println(s.replaceAll("([^aeiouAEIOU\\W])","_")); // Case sensitive
        System.out.println(s.replaceAll("((?i)[^aeiou\\W])","_"));  //(?)  режим Case insensitive
        System.out.println(s.replaceAll("((?i)[aeiou])","_"));      // Case insensitive
    }
}
