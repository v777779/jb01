package ch17.ex06.include;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nUnsuported Methods Check\n");

        List<String> list = Arrays.asList("A B C D E F G H I J K L)".split(" "));
        Unsupport.check("Modifiable Copy", new ArrayList<>(list));  // все разрешено
        Unsupport.check("List<>", list);  // все что меняе размер запрещено
        Unsupport.check("Unmodifiable Copy", Collections.unmodifiableList(list)); // все запрещено

    }
}
