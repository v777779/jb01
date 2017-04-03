package ch17.ex40.include;

import java.util.*;

/**
 * Created by V1 on 03-Apr-17.
 */
public class ListSort {
    private static List<String> list = new ArrayList<>(Arrays.asList(
            "one Two three Four five six one".split(" ")
    ));
    public static void check() {
        List<String> list = new ArrayList<>(ListSort.list);
        list.addAll(ListSort.list); // дважды добавить

        System.out.println(list);
        Collections.shuffle(list, new Random()); // перемешать
        System.out.println("shuffle:"+list);
        ListIterator<String> lit = list.listIterator(10); // с 10го индекс и далее
        while (lit.hasNext()) {
            lit.next();
            lit.remove(); // удалитьв все
        }
        System.out.println("trimmed:"+list);
        Collections.sort(list);
        System.out.println("sorted :"+list);
        String key = list.get(7); // 7й индекс
        int index = Collections.binarySearch(list,key);
        System.out.println("index  :"+index+" key:"+key);
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        System.out.println("sortedU:"+list);
        key = list.get(7); // 7й индекс
        index = Collections.binarySearch(list,key);
        System.out.println("index  :"+index+" key:"+key);




    }
}
