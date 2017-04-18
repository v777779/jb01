package ch19.ex03.codec.food;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public interface Food {
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
