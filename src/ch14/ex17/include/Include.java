package ch14.ex17.include;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {

    public static void app(String[] args) {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nReflection Check\n");


        if (args.length < 1) {
            System.out.println("Usage: java  ch14.ex17.Ex17  ch.<path>.ClassName");
            args = new String[] {"ch14.ex16.access.coffee.CoffeeGen"}; //,"Coffee"
            System.out.println("Test Mode");
            System.out.println("---------");
//            return;
        }
        if (args.length == 1) {
            Methods.show(args[0]);
        } else {
            Methods.show(args);  // с ключевым словом поиска
        }



    }
}
