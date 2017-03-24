package ch11.ex28.local;

import lib.utils.ArrayUtils;
import lib.utils.Range;
import lib.utils.Show;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nPriority Queue Check\n");
        Random rnd = new Random();
//PQ wo priority
        PriorityQueue<Integer> pqInt = new PriorityQueue<>();
        for (int i = 0; i < 25; i++) {
            pqInt.offer(rnd.nextInt(100));
        }
        Show.showQ(pqInt);

//Pq with priority
        List<Integer> ints = Range.arrayList(25);
        Show.showInt(ints.iterator());

        pqInt = new PriorityQueue<>(ints);                          // default forward direction
        Show.showQ(pqInt);

//Pq with priority Rev
        System.out.print("Custom Reverse:");
        pqInt = new PriorityQueue<>(ints.size(), new CompIntR());    // custom Comparator
        pqInt.addAll(ints);
        Show.showQ(pqInt);
        System.out.print("Standard Reverse:");
        pqInt = new PriorityQueue<>(ints.size(), Collections.reverseOrder()); // with standard comparator
        pqInt.addAll(ints);
        Show.showQ(pqInt);

//Pq with priority String Rev
        List<String> listStr = Arrays.asList("Education should eschew obfuscation".split(" "));
        System.out.print("Default:");
        PriorityQueue<String> pqStr = new PriorityQueue<>(listStr);
        Show.showQ(pqStr);
        System.out.print("Custom Reverse:");
        pqStr = new PriorityQueue<>(listStr.size(), new CompStrR());
        pqStr.addAll(listStr);
        Show.showQ(pqStr);
//Pq with standard Reverse
        System.out.print("Standard Reverse:");
        pqStr = new PriorityQueue<>(listStr.size(), Collections.reverseOrder()); // with standard comparator
        pqStr.addAll(listStr);
        Show.showQ(pqStr);

//Pq with List and Set
        char[] chars = "Education should eschew obfuscation".toCharArray();
        List<Character> clist = Arrays.asList(ArrayUtils.toObject(chars));
        Set<Character> hset = new HashSet<>();
        for (char aChar : chars) {
            hset.add(aChar); // автоупаковка
        }

        System.out.print("List Reverse Order:");
        PriorityQueue<Character> pqCh = new PriorityQueue<>(clist.size(), new CompChR());
        pqCh.addAll(clist);
        Show.showQ(pqCh);
        System.out.print("Set Reverse Order:");
        pqCh = new PriorityQueue<>(hset.size(), new CompChR());
        pqCh.addAll(hset);
        Show.showQ(pqCh);
    }
}
