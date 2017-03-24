package ch15.ex35.local;

import lib.pets.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {

    static void oldStyle(List list) {   // метод старого стиля без
        list.add(new Cat());            // указания объекта хранения
    }


    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nDynamic Type Control Check\n");

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Pug());
        dogs.add(new Mutt());

        oldStyle(dogs);             // добавляет  в список <Dog> объект <Cat>
        System.out.println("dogs :"+dogs);


        List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(), Dog.class);
        dogs2.add(new Pug());
        dogs2.add(new Mutt());

        try {
            oldStyle(dogs2); // exception
        } catch (Exception e) {
            System.out.println("catch:"+e.toString().replaceAll("\\w+[\\.:]",""));
        }
        System.out.println("dogs2:"+dogs2);
        List<Pet> pets = Collections.checkedList(new ArrayList<Pet>(), Pet.class);
        pets.add(new Pug());
        pets.add(new Cymr()); // все срабатывает
        System.out.println("pets :"+pets);





    }
}
