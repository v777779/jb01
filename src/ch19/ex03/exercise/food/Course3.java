package ch19.ex03.exercise.food;

import lib.utils.Enums;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public enum Course3 {
    APPETIZER(Food3.Appetizer.class),
    MAINCOURSE(Food3.MainCourse.class),
    DESSERT(Food3.Dessert.class),
    COFFEE(Food3.Coffee.class),
    BREAD(Food3.Bread.class);

    private Food3[] foods;

    Course3(Class<? extends Food3> kind) {
        foods = kind.getEnumConstants();
    }
    public Food3 randomSelection() {
        return Enums.random(foods); // через массив
    }


}
