package ch15.ex34.remote;

import ch15.ex34.remote.nosbarg.DerivedGS;
import ch15.ex34.remote.ordarg.DerivedSetter;
import ch15.ex34.remote.sbarg.ISelfBoundSetter;
import ch15.ex34.remote.sbarg.ISetter;
import ch15.ex34.remote.sbarg.Setter;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Remote {
    public static void app() {
        System.out.println("\n====REMOTE===");
        System.out.println("\nCovariance Check\n");

        System.out.println("Ordinary Arguments:");
        DerivedSetter ds = new DerivedSetter();
        ds.set(new Base());     // вызывается метод set() предка
        ds.set(new Derived());  // вызывается метод set() потомка

        System.out.println("\nSelfBound Arguments:");
        ISetter s1 = new Setter();
        ISetter s2 = new Setter();
        ISelfBoundSetter sb = new Setter(); // по предку создаем экземпляр

        s1.set(s2); // прокатывает по интерфейсу ISetter
//      s2.set(sb);  // не работает

        System.out.println("\nNotSelfBound Arguments:");
        DerivedGS dgs = new DerivedGS();
        dgs.set(new Derived()); // прямое применение точного типа
        dgs.set(new Base());    // базовый класс с <T>= <Base> кривая перегрузка

    }
}
