package ch11.ex24.access;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 24  Check\n");
        Random rnd = new Random();

        Map<String, String> lhmap = new LinkedHashMap<>();
        for (int i = 0; i < 50 ; i++) {
            lhmap.put("key_"+rnd.nextInt(10),"val_"+rnd.nextInt(100));
        }
//ArrayList
        System.out.println("My ArrayList Version");
        Set<String> tset = new TreeSet<>(lhmap.keySet()); // вытащили список в TreeSet
        Map<String,String> lhmap2 = new LinkedHashMap<>();

        Iterator<String> it = tset.iterator();
        while (it.hasNext()) {
            String key = it.next();
           lhmap2.put(key,lhmap.get(key));
        }
        System.out.println("     :"+lhmap);
        System.out.println("LHMAP:"+lhmap2);

//Array
        System.out.println("\nOfficial Array Version");
        String [] array = lhmap.keySet().toArray(new String[0]); //
        System.out.println("Array unsorted:"+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Array sorted  :"+Arrays.toString(array));

        Map<String,String> lhmap4 = new LinkedHashMap<>();

        for (int i = 0; i < array.length; i++) {
            lhmap4.put(array[i],lhmap.get(array[i]));
        }
        System.out.println("Official LHMAP:"+lhmap4);



    }
}
