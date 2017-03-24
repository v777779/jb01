package ch11.ex16.include;

import lib.utils.TextFile;

import java.util.*;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nSet Read Words From Text File Check\n");

        System.out.println("current_dir:" + System.getProperty("user.dir"));

        Set<String> tset = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);  // задать порядок сортировки

        List<String> list = new TextFile("./src/ch11.ex16/local/Local.java", "\\W+"); //создает ArrayList<String>
        tset.addAll(list);  // создать множество из List

        System.out.println("\nString out TreeSet amde from TexhFile ArrayList<String> ");
        System.out.println("Print using Format %%12s to Split on Columns\n");
        Iterator<String> it = tset.iterator();
        for (int i = 0; i < tset.size(); i++) { // крутим пока есть индексы
            System.out.printf("%-12s",it.next());
            if ( (i > 0) && ((i % 8) == 0)) {
                System.out.println(); // каждое 25 слово переводим строку
            }
        }
        System.out.println();
        System.out.println("\nRemove All Words less than 4 symbols in length\n");

        Set<String> hset = new HashSet<>(tset); // быстрый set
        it = hset.iterator();
        while (it.hasNext()) {
            if (it.next().length() < 4) {
                it.remove(); // удалить слово меньше 4 символов длиной
            }
        }
        tset.clear();
        tset.addAll(hset); // скопировать в новый набор
        it = tset.iterator();
        for (int i = 0; i < tset.size(); i++) { // крутим пока есть индексы
            System.out.printf("%-12s",it.next());
            if ( (i > 0) && ((i % 8) == 0)) {
                System.out.println(); // каждое 25 слово переводим строку
            }
        }




    }
}
