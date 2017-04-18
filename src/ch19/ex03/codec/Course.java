package ch19.ex03.codec;

import ch19.ex03.codea.Enums;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public enum Course {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    private Food[] foods;

    Course(Class<? extends Food> kind) {
        foods = kind.getEnumConstants();
    }
    public Food randomSelection() {
        return Enums.random(foods); // через массив
    }


}
