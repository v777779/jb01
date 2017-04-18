package ch19.ex03.codec.food;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class Meal {
    public static void check() {

        System.out.println("Meal3 Enum Interface Random Check:");
        System.out.println("-------------------");
        for (int i = 0; i < 5 ; i++) {   // перебирает пять наборов еды
            for (Course course : Course.values()) {     // перебирает все константы класса
                Food food = course.randomSelection();   // для каждой константы генерится свое values[] Food3.xxx.class
                System.out.println(food);               // генерится случайное блюдо  <aapetizer><main><dessert><coffee>
            }                                           // и так по кругу
            System.out.println("-------------------");
        }
    }
}
