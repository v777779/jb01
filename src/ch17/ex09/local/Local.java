package ch17.ex09.local;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nSet Types Check\n");

        TypeSets.checkHash(new HashSet());
        TypeSets.checkHash(new LinkedHashSet());
        TypeSets.checkTree(new TreeSet());
        System.out.println("\nNot Working Types:");
        TypeSets.check(new HashSet());          // HashSet<SetType>  не работает нет hashCode()
        TypeSets.checkTree(new HashSet());      // HashSet<TreeType> не работает нет hashCode()
        TypeSets.check(new LinkedHashSet());
        TypeSets.checkTree(new LinkedHashSet());

        try {
            TypeSets.check(new TreeSet());          // не работает TreeSet<SetType> не работает no compareTo
        } catch (Exception e) {
            System.out.println("catch: не работает TreeSet<SetType>  нет compareTo()");
        }
        try {
        TypeSets.checkHash(new TreeSet());      // не работает TreeSet<HashType> не работает no compareTo
        } catch (Exception e) {
            System.out.println("catch: не работает TreeSet<HashType> нет compareTo()");
        }




    }
}
