package ch17.ex26.include;

import lib.pets.Individual;
import lib.pets.Pets;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nIndividualOld Class Check\n");

        Set<Individual> tSet = new TreeSet<>();
        tSet.addAll(Pets.getList());
        System.out.println(tSet);


    }
}
