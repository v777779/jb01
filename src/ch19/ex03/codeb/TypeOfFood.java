package ch19.ex03.codeb;

import ch19.ex03.codec.food.Food;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class TypeOfFood {
    public static void check() {
        System.out.println("TypeFood Demo:");

        Food food = Food.Appetizer.SALAD;
        System.out.println("food:"+food);
        food = Food.MainCourse.LASAGNE;
        System.out.println("food:"+food);
        food = Food.Dessert.GELATO;
        System.out.println("food:"+food);
        food = Food.Coffee.CAPPUCCINO;
        System.out.println("food:"+food);

    }
}
