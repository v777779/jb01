package ch14.ex11.include;

import ch14.ex09.access.Access;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nClass Link Check\n");
        Class intClass = int.class;
        intClass = double.class;                    // сработало
        Class<Integer> integerClass = int.class;    // сработало
        integerClass = Integer.class;               // сработало
        //integerClass = double.class ;             // не работает  Double не расширяет Integer
//        Class<Number> numNumClass = int.class;      // странно но так НЕ работает

        Class<?> numClass = int.class;              // работает
        numClass = double.class;                    // работает
        Access.getInfo(Byte.class);
        Access.getInfo(Integer.class);
        Access.getInfo(Double.class);

        Class<? extends Number>  numExtClass = int.class;  // так работает для всех subclasses of Number
        numExtClass = Integer.class;
        numExtClass = Float.class;
        numExtClass = float.class;
        numExtClass = double.class;
        numClass = Number.class;



    }
}
