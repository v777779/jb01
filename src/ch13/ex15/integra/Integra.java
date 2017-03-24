package ch13.ex15.integra;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nRegex InOut Check\n");
        String regex = "\\b[Ssct]\\w+"; // вывести все слова с букв S* s* c* t*
        JGrep jp = new JGrep("src/ch13.ex15/integra/Level3.java",regex);
        jp.find();
    }
}
