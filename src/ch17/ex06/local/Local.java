package ch17.ex06.local;

import lib.maps.CMap;
import lib.maps.Countries;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nCollection methods Check\n");

        Collection<String> c = new ArrayList<>();
        c.addAll(Countries.names(6));
        c.add("ten");
        c.add("eleven");
        System.out.println(c);

        Object[] o = c.toArray();
        String[] s = c.toArray(new String[0]); // подтверждаем тип
        System.out.println("Object[]:" + Arrays.toString(o));
        System.out.println("String[]:" + Arrays.toString(s));

        System.out.println("Collections.max():" + Collections.max(c));
        System.out.println("Collections.min():" + Collections.min(c));


        Collection<String> c2 = new ArrayList<>();
        c2.addAll(Countries.names(6));  // добавляем первые 6 стран
        c.addAll(c2);  // теперь в с 12 стран два раза по 6
        System.out.println("c.addAll(c2)            :" + c);
        c.remove(CMap.DATA[0][0]);  // удаляем первую страну
        System.out.println("c.remove(CMap.DATA[0][0]:" + c);

        c.remove(CMap.DATA[1][0]);  // удаляем вторую страну
        System.out.println("c.remove(CMap.DATA[1][0]:" + c);
        c.removeAll(c2);
        System.out.println("c.removeAll(c2)         :" + c);
        c.addAll(c2);  // теперь в с 6 стран
        System.out.println("c.addAll(c2)            :" + c);

        System.out.println("\nSearching in Collection:");
        String val = CMap.DATA[3][0];
        boolean flag = c.contains(val);  // теперь в с 6 стран
        System.out.println("c.contains(val)         :" + flag);
        flag = c.containsAll(c2);  // теперь в с 6 стран
        System.out.println("c.containsAll(c2)       :" + flag);

        System.out.println("\nRetain in Collection:");
        Collection<String> c3 = ((List<String>)c).subList(3,5);
        System.out.println("c2                      :"+c2);
        System.out.println("c3                      :"+c3);
        c2.retainAll(c3);
        System.out.println("c2.retainAll(c3)        :" + c2);


        System.out.println("\nRemove in Collection:");
        c2.removeAll(c3);
        System.out.println("c2.removeAll(c3)        :" + c2);
        flag = c2.isEmpty();
        System.out.println("c2.isEmpty()            :" + flag);

        c = new ArrayList<>();
        c.addAll(Countries.names(6));
        System.out.println("c                       :"+c);
        c.clear();
        System.out.println("c.clear()               :" + c);





    }
}
