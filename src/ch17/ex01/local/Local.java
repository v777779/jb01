package ch17.ex01.local;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nFillin Collection Check\n");

        List<StringAddress> sList;
        sList = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(sList.toString().replaceAll("\\,|\\w+\\.", ""));

        Collections.fill(sList,new StringAddress("World!"));
        System.out.println(sList.toString().replaceAll("\\,|\\w+\\.", ""));
// одна ссылка на все про все
        sList.get(0).setS("Starts!");
        System.out.println(sList.toString().replaceAll("\\,|\\w+\\.", ""));




    }
}
