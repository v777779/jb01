package ch08.ex11;

import ch08.ex11.include.Sandwich;
import ch08.ex11.local.Derived;
import ch08.ex11.local.PrivateOverride;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Ex11 {
    public static void main(String[] args) {
        System.out.println("\n Inheritance Field Problem Check\n");
        PrivateOverride prOver = new Derived();
        Derived derived = new Derived();

        prOver.getNotOverrided();
//        privateOverride.getOverrided();  // не работает, потому что экземпляр parent не видит свой getOverrided
                                         // и для него это новый метод потомка о котором он ничего не знает
//        privateOverride.f();             //не работает это новый метод о котором экземпляр предка ничего не знает
        derived.getOverrided();          // работает это метод потомка
        derived.f();                     // работает это метод потомка


        System.out.println("\nManual Check \n");
        System.out.println("derived.iField = "+prOver.iField);       // не работает берет поле предка
        System.out.println("derived.getField = "+prOver.getField()); // работает переопределенный метод берет поле потмока

        System.out.println("\n Inheritance Static Method Problem Check\n");
        prOver.staticNotOverrided(); // не работает вызывает static методы предка
        prOver.staticOverrided();    // не работает, вызывает static метод предка

        System.out.println("\nExercise 11 Polymorphism Init Check\n");
        Sandwich sandwich = new Sandwich();
    }
}
