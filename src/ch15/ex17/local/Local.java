package ch15.ex17.local;

import java.util.EnumSet;
import java.util.Set;
import java.util.TreeSet;

import static ch15.ex17.local.WaterColors.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nSet w Generic Check\n");
        Set<WaterColors> set1 = EnumSet.range(BRILLIANT_RED,VIRIDIAN_HUE);
        Set<WaterColors> set2 = EnumSet.range(CERULEAN_BLUE_HUE,BURNT_UMBER);
        System.out.println("set1: "+set1);
        System.out.println("set2: "+set2);

        System.out.println("unioin      :"+Sets.union(set1,set2));
        Set<WaterColors> seti =  Sets.intersection(set1,set2);
        System.out.println("intersection:"+seti);
        System.out.println("comp.set1   :"+new TreeSet<>(Sets.difference(set1,seti)));
        System.out.println("comp.set2   :"+new TreeSet<>(Sets.difference(set2,seti)));
        System.out.println("complement  :"+new TreeSet<>(Sets.complement(set1,set2)));
        System.out.println("union(set1,set2):"+Sets.union(set1,set2).getClass().getSimpleName());

    }
}
