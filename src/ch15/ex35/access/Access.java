package ch15.ex35.access;

import lib.coffee.Americano;
import lib.coffee.Capuccino;
import lib.coffee.Coffee;
import lib.coffee.Latte;
import lib.pets.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    static void oldStyle(List list) {   // метод старого стиля без
        list.add(new Cat());            // указания объекта хранения
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 35 Dynamic Check of Type Check\n");

        List<Americano> coffee = new ArrayList<>();
        coffee.add(new Americano());
        coffee.add(new Americano());

        oldStyle(coffee);             // добавляет  в список <Dog> объект <Cat>
        System.out.println("coffee :"+coffee);


        List<Capuccino> coffee2 = Collections.checkedList(new ArrayList<Capuccino>(), Capuccino.class);
        coffee2.add(new Capuccino());
        coffee2.add(new Capuccino());

        try {
            oldStyle(coffee2); // exception
        } catch (Exception e) {
            System.out.println("catch  :"+e.toString().replaceAll("\\w+[\\.:]",""));
        }
        System.out.println("coffee2:"+coffee2);

        List<Coffee>  coffees = Collections.checkedList(new ArrayList<Coffee>(), Coffee.class);
        coffees.add(new Americano());
        coffees.add(new Capuccino()); // все срабатывает
        coffees.add(new Latte());
        System.out.println("coffees:"+coffees);

    }
}
