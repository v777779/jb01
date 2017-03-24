package ch13.ex15.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 15 Regex Check\n");
//      {"CANEQ","NOCASE","COMMENT","DOTALL","MULTI","UNICASE","UNIXLINE"}
        String regex = "\\b[sct]\\w+";                  // вывести все слова с букв S* s* c* t*
        JGrep jp = new JGrep("src/ch13.ex15/files/JGrepLight.java",regex, "unic");
        jp.find();


    }
}
