package ch16.ex10.access;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void fill(List<Banana>[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = new ArrayList<>(Arrays.asList(
                    new Banana(), new Banana()
            ));
        }
   }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 10 Check\n");
        ListOfGeneric<Banana> contList = new ListOfGeneric(10);
        List<Banana>[] lists = (List[])contList.get();
        fill(lists);
        System.out.println("lists:"+Arrays.deepToString(lists));

        Collection<Banana>[] cols = new Collection[5];
//        List<Banana>[] lists1 = (List[])cols; // не работает, поэтому не проходит универсальный класс

    }
}
