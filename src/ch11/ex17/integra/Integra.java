package ch11.ex17.integra;

import lib.pets.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nMap MultiDimension Check\n");

        Map<Person, List<? extends Pet>> petPeople = new HashMap<>();  // ВНИМАНИЕ двойное применение Generic
        petPeople.put(new Person("Dawn"),
                Arrays.asList(
                        new Cymr("Molly"),
                        new Mutt("Spot")
                ));
        petPeople.put(new Person("Kate"),
                Arrays.asList(
                        new Cat("Shackleton"),
                        new Cat("Elsie May"),
                        new Dog("Margarett")
                ));
        petPeople.put(new Person("Sofie"),
                Arrays.asList(
                        new Pug("Louie"),
                        new Cat("Stanford"),
                        new Cat("Pinkola")
                ));
        petPeople.put(new Person("Jekky"),
                Arrays.asList(
                        new Rat("Freckly")

                ));

        System.out.println("People: keyset() > "+petPeople.keySet());
        System.out.println("People: values() > "+petPeople.values());
        System.out.println("Person Iterators:");

        for (Person person : petPeople.keySet()) {
            System.out.print(person+" has:\t");
//            List<Pet> pets = new ArrayList<>(petPeople.get(person));  // отсюда создать итератор
//            for (Pet pet : pets) {  // потом перенести инит часть прямо в итератор
            for (Pet pet : petPeople.get(person)) {  // потом перенести инит часть прямо в итератор
                System.out.print("  {"+pet+"}  ");
            }
            System.out.println();
        }

        System.out.println("\n Multidimensional Map \n");
        Map<String, Map<Person,List<? extends Pet>>> people = new HashMap();
        people.put("City",petPeople);
        people.put("Arlington",petPeople);
        people.put("Mall",petPeople);
        people.put("River",petPeople);

        for (String s : people.keySet()) {
            System.out.print(s+":\n");
            for (Person person : people.get(s).keySet()) {
                System.out.printf("[%-12s]=[pets:",person);
                for (Pet pet : people.get(s).get(person)) {
                    System.out.printf("%-16s",pet);
                }
                System.out.println("]");
            }
        }

}
}
