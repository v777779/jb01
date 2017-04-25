package ch19.ex03.exercise.food;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public interface Food3 {
    enum  Appetizer implements Food3 {
        SALAD, SOUP,SPRING_ROLLS;
    }
    enum  MainCourse implements Food3 {
        LASAGNE, BURRITO, PAD_THAI,LENTILS, HUMMOUS, VINDALOO;
    }
    enum  Dessert implements Food3 {
        TIRAMISU,GELATO,BLACK_FOREST_CAKE,FRUIT,CREME_CARAMEL;
    }
    enum  Coffee implements Food3 {
        BLACK_COFFEE,DECAF_COFFEE, ESPRESSO, LATTE, CAPPUCCINO,TEA, HERB_TEA;
    }
    enum  Bread implements Food3 {
        BLACK_BREAD,FRENCH_BAGUETTE, BAGET, GENERIC_BREAD, PEG_BREAAD;
    }


}
