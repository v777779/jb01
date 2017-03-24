package ch12.ex21.include;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nNested Try Exceptions Check\n");

        try {
            InputFile f = new InputFile("src/ch12.ex21/local/Local.java");
            try {
                String s;
                int i = 1;
                while ((s = f.getLine()) != null) {  // распечатка строк в цикле
                    System.out.printf("%3d:%s\n", i++, s);
                }
            } catch (Exception e) {  // внутренний цикл работы с Exception файл открыт
                System.out.println("Inner Exception:");
            }finally {              // исключение при открытом экземпляре или штатный выход
                f.dispose();
            }
        } catch (Exception e) {  // внешний цикл работы с Exception файл не открыт или после работы
            System.out.println("External Exception:");
        }


    }
}
