package ch.ex25.include;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nGeneric Array Check\n");
        GenericArray<Integer> genIntArray  = new GenericArray<>(10);

        try {
        Integer[] intArray = genIntArray.rep();  // cast не прокатывает
        } catch (Exception e) {
            System.out.println("Can't cast Array");  // вызывает исключение
        }


        System.out.println("Object Array");
        Object[] objArray = genIntArray.rep(); // вот так работает
        for (int i = 0; i < objArray.length ; i++) {
            objArray[i] = "str"+i; // прокатило, то есть от Integer ничего не осталось
        }

        for (Object o : objArray) {
            System.out.print(o+" ");
        }
        System.out.println();

        System.out.println("Object Array2");
        GenericArray2<Integer> genIntArray2  = new GenericArray2<>(10);
        Object[] objArray2 = genIntArray2.rep(); // вот так работает
        for (int i = 0; i < objArray.length ; i++) {
            objArray2[i] = "str"+i; // прокатило, то есть от Integer ничего не осталось
        }
        for (Object o : objArray2) {
            System.out.print(o+" ");
        }


    }
}
