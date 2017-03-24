package ch13.ex07.local;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nRegEx Check\n");
//regex
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+1234".matches("-?\\d+"));          // + не вписался
        System.out.println("-+56781234".matches("(-\\+)?\\d+")); // + отработан
//regex
        String s = "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";
//regex =" "
        String regex = " ";
        System.out.println(Arrays.toString(s.split(regex)));        // пробелы ушли
        regex = "\\W+"; // один или более символов НЕ из a-Z0-9
        System.out.println(Arrays.toString(s.split(regex)));        // пробелы и точки ушли
//search and replace
        System.out.println(s.replaceFirst("f\\w+","located"));  // заменить первое слово с f*** до пробела или запятой
        System.out.println(s.replaceAll("(f|y)\\w+","TUMP"));       // заменить все из списка f*** или y***
        System.out.println(s.replaceAll("sh\\w+|tree|the","CAN"));  // заменить все из списка
    }
}
