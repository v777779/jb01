package ch.ex17.access;

import lib.utils.Range;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static ch.ex17.access.WaterColors.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 17 Set w Generic Check\n");

        Set<WaterColors> set1 = EnumSet.range(BRILLIANT_RED,VIRIDIAN_HUE);
        Set<WaterColors> set2 = EnumSet.range(CERULEAN_BLUE_HUE,BURNT_UMBER);
        System.out.println("set1: "+set1);
        System.out.println("set2: "+set2);

        System.out.println("unioin      :"+Sets2.union(set1,set2));
        Set<WaterColors> seti =  Sets2.intersection(set1,set2);
        System.out.println("intersection:"+seti);
        System.out.println("comp.set1   :"+new TreeSet<>(Sets2.difference(set1,seti)));
        System.out.println("comp.set2   :"+new TreeSet<>(Sets2.difference(set2,seti)));
        System.out.println("complement  :"+new TreeSet<>(Sets2.complement(set1,set2)));
        System.out.println();
        System.out.println("union(set1,set2):"+Sets2.union(set1,set2).getClass().getSimpleName());
        System.out.println();
        Set<Integer> set3 = new HashSet<>(Range.arrayList(10));
        Set<Integer> set4 = new HashSet<>(Range.arrayList(10));
        System.out.println("set3        :"+set3);
        System.out.println("set4        :"+set4);
        System.out.println("unioin      :"+Sets2.union(set3,set4));
        System.out.println("union(set3,set4):"+Sets2.union(set3,set4).getClass().getSimpleName());



    }
}
