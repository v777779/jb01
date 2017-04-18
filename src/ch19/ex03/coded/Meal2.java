package ch19.ex03.coded;

import lib.utils.Enums;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public enum Meal2 {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    interface Food {
        enum  Appetizer implements Food {
            SALAD, SOUP,SPRING_ROLLS;
        }
        enum  MainCourse implements Food {
            LASAGNE, BURRITO, PAD_THAI,LENTILS, HUMMOUS, VINDALOO;
        }
        enum  Dessert implements Food {
            TIRAMISU,GELATO,BLACK_FOREST_CAKE,FRUIT,CREME_CARAMEL;
        }
        enum  Coffee implements Food {
            BLACK_COFFEE,DECAF_COFFEE, ESPRESSO, LATTE, CAPPUCCINO,TEA, HERB_TEA;
        }
    }

    private Food[] foods;

    Meal2(Class<? extends Food> kind) {
        foods = kind.getEnumConstants();
    }
    public Food randomSelection() {
        return Enums.random(foods); // через массив
    }

    public static void check() {
        System.out.println("\nMeal2 Enum Interface Random Compact:");
        System.out.println("-------------------");
        for (int i = 0; i < 5 ; i++) {                  // перебирает пять наборов еды
            for (Meal2 meal : Meal2.values()) {         // перебирает все константы класса
                Food food = meal.randomSelection();     // для каждой свое foods[] Food3.xxx.class
                System.out.println(food);               // <aapetizer><main><dessert><coffee>
            }                                           // и так по кругу
            System.out.println("-------------------");
        }
    }
}
