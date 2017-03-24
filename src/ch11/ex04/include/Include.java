package ch11.ex04.include;

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
        System.out.println("\nCollection asList() Check\n");
        List<Snow> snow1 = Arrays.asList(     // создаем объект List   все объекты extends Snow
                new Crusty(), new Slush(), new Powder()
        );

        List<Snow> snow2 = Arrays.asList(     // создаем объект List   все объекты extends Snow
                new Light(), new Heavy(), new Powder(), new Crusty(), new Slush()
        );

        List<Snow> snow3 = new ArrayList<>();     // создаем объект List   все объекты extends Snow
        Collections.addAll(snow3,new Light(), new Heavy(), new Crusty());  // через collection

        List<Snow> snow4 = Arrays.asList(     // создаем объект List   все объекты extends Snow
                new Light(), new Heavy(), new Powder(), new Crusty(), new Slush()
        );  // через явное указание типа

        System.out.println(snow1);
        System.out.println(snow2);
        System.out.println(snow3);
        System.out.println(snow4);

    }
}
