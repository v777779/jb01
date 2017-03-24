package ch08.ex18;

import ch08.ex18.local.Math;
import ch08.ex18.local.Useful;
import ch08.ex18.access.*;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Ex18 {
    public static void main(String[] args) {
        System.out.println("Dynamic Child Define Check");
        Useful[] x = new Useful[]{ new Useful(), new Math()};
        x[0].f();
//        x[1].i();  // не может определить на этапе компиляции
        System.out.println("\nExercise 18 Dynamic Child Define Check\n");
        Cycle[] cycles = new Cycle[] { new Unicycle(), new Bicycle(), new Tricycle()};

        for (Cycle cycle : cycles) {
            cycle.ride();
            cycle.balance();  // сработало
        }
        System.out.println("\nDown Stream Conversion Check\n");
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        ((Tricycle)cycles[2]).balance();  //сработало но метод parent


    }
}
