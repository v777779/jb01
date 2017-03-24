package ch.ex25.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nArrays w Generic Check\n");

        ListGeneric<Integer> lg = new ListGeneric<>();
        for (int i = 0; i < 10 ; i++) {
            lg.add(i+1000);
        }

        ArrayGeneric<Integer> ag = new ArrayGeneric<>(10);
        for (int i = 0; i < 10 ; i++) {
            ag.set(i,i+1000);
        }

        System.out.print("ArrayList : [");
        for (int i = 0; i < 10 ; i++) {
            System.out.print(lg.get(i)+" ");
        }
        System.out.println("]");

        System.out.print("ArrayClass: [");
        for (int i = 0; i < 10 ; i++) {
            System.out.print(ag.get(i)+" ");
        }
        System.out.println("]");


    }
}
