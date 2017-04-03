package ch17.ex40.local;

import java.util.*;

/**
 * Created by V1 on 03-Apr-17.
 */
public class Utils {
    public static List<String> list = Arrays.asList(
            "one Two three Four five six one".split(" ")
    );

    public static void check() {
        System.out.println(list);
        System.out.println("\'list\' disjoint (Four)? :" +
                Collections.disjoint(list, Collections.singleton("Four")));
        System.out.println("\'list\' disjoint (four)? :" +
                Collections.disjoint(list, Collections.singleton("four")));

        System.out.println("max                :" + Collections.max(list));
        System.out.println("min                :" + Collections.min(list));

        System.out.println("max w/Comp         :" + Collections.max(list, String.CASE_INSENSITIVE_ORDER));
        System.out.println("max w/Comp         :" + Collections.min(list, String.CASE_INSENSITIVE_ORDER));

        List<String> subList = Arrays.asList("Four five six".split(" "));
        System.out.println("indexOfSublist     :" + Collections.indexOfSubList(list, subList));
        System.out.println("lastIndexOfSublist :" + Collections.lastIndexOfSubList(list, subList));
        subList = Arrays.asList("one".split(" "));
        System.out.println("indexOfSublist     :" + Collections.indexOfSubList(list, subList));
        System.out.println("lastIndexOfSublist :" + Collections.lastIndexOfSubList(list, subList));
        Collections.replaceAll(list, "one", "Yo");
        System.out.println("replaceAll         :" + list);
        Collections.reverse(list);
        System.out.println("reverse            :" + list);
        Collections.rotate(list, 3);
        System.out.println("rotate(3)          :" + list);
        List<String> source = Arrays.asList("in the matrix".split(" "));
        Collections.copy(list, source);
        System.out.println("copy(list,source)  :" + list);
        Collections.swap(list, 0, list.size() - 1);
        System.out.println("swap()             :" + list);
        Collections.shuffle(list, new Random()); // со своим генератором
        System.out.println("shuffle            :" + list);
        Collections.fill(list, "pop");
        System.out.println("fill               :" + list);
        System.out.println("frequency()        :" + Collections.frequency(list, "pop"));
        List<String> dups = Collections.nCopies(3, "snap");
        System.out.println("nCopies            :"+dups);
        System.out.println("list disjoint dups?:"+Collections.disjoint(list,dups));

        Enumeration<String> e = Collections.enumeration(dups); // в старом стиле
        Vector<String> v = new Vector<>(); // в старом стиле
        while(e.hasMoreElements()) {
            v.addElement(e.nextElement());  // перекачали в Vector
        }
        ArrayList<String> arrayList = Collections.list(v.elements());// Vector >> ArrayList
        System.out.println("arrayList          :"+arrayList);

        Comparator<String>  c = Collections.reverseOrder();
        list = Arrays.asList( "one Two three Four five six one".split(" "));
        System.out.println(list);
        Collections.sort(list,c);
        System.out.println(list);

    }
}
