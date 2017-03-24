package ch08.ex1;

import ch08.ex1.access.Bicycle;
import ch08.ex1.access.Cycle;
import ch08.ex1.access.Tricycle;
import ch08.ex1.access.Unicycle;
import ch08.ex1.local.Brass;
import ch08.ex1.local.Music;
import ch08.ex1.local.Stringed;
import ch08.ex1.local.Wind;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Ex1 {


    public static void main(String[] args) {
        Music music = new Music();
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass horn = new Brass();

        music.play(flute);  // вызов по перегрузке
        music.play(violin);  // вызов по перегрузке
        music.play(horn);  // вызов по перегрузке

        System.out.println("\nExercise 1 Polymorphism.main\n");
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Cycle cycle;

        cycle = unicycle;   // default casting now it's Unicycle
        cycle.ride();       // Cycle ride parent used
        cycle = bicycle;    // default casting now it's Bicycle
        cycle.ride();       // Bicycle ride
        cycle = tricycle;   // default casting now it's Tricycle
        cycle.ride();       // Tricycle ride

        System.out.println("\nUpstream Conversion Check\n");

        Cycle cycle1 = new Unicycle(); // восходящее преобразование
        Cycle cycle2 = new Bicycle();
        Cycle cycle3 = new Tricycle();

        cycle1.ride();
        cycle2.ride();
        cycle3.ride();






    }

}
