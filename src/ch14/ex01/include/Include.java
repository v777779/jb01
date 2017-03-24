package ch14.ex01.include;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() throws  Exception {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nClass Object Check\n");
        System.out.println("main() started:");
        new Candy();
        System.out.println("main: after Candy");

        System.out.println("Gum > "+Class.forName("ch14.ex01.include.Gum"));  // получение ссылки на обьект класса

        System.out.println("main: after Class.forName(\"Gim\")");
        new Cookie();
        System.out.println("main: after Cookie");

        System.out.println("Cookie > "+Class.forName("ch14.ex01.include.Cookie"));

    }
}
