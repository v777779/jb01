package ch17.ex06.access;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 6 Optional Methods Check\n");

        List<String> list = Arrays.asList("A B C D E F G H I J K L)".split(" "));
        Unsupport.check("Modifiable Copy", new ArrayList<>(list));  // все разрешено
        Unsupport.check("List<>", list);  // все что меняе размер запрещено

        List<String> list2 = Arrays.asList("A B C D E F G H I J K L)".split(" "));
        Unsupport.check("Unmodifiable Copy", Collections.unmodifiableList(list2)); // все запрещено

    }
}
