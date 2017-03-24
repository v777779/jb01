package ch.ex25.unit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Unit {
// методы с ограничением
    static <T extends ISuperHearing> void superHearing(SuperHero<T> hero) {
        hero.getPower().hearSubtleNoises(); // получить объект и он может ТОЛЬКО слышать
    }
    static <T extends ISuperHearing& ISuperSmell> void superFind(SuperHero<T> hero) {
        hero.getPower().hearSubtleNoises(); // получить объект доступен поиск по СЛУХУ
        hero.getPower().trackBySmell();     // доступен поиск по ЗАПАХУ
    }

    public static void app() {
        System.out.println("\n====UNIT===");
        System.out.println("\nBound Multi Level Check\n");
        DogBoy dogBoy = new DogBoy();  // класс хранения объекта с поиском по слуху и запаху
        System.out.println("SupeHearing:");
        superHearing(dogBoy);
        System.out.println("SupeFind:");
        superFind(dogBoy);

        List<? extends ISuperHearing> listH = new ArrayList<IHear>();  // можно так
        List<? extends ISuperHearing> listH2 = new ArrayList<ISuperHearing>(); // и так

//        List<? extends ISuperHearing & ISuperSmell> listS;  //так нельзя
        List<? extends ISuperFind> listF = new ArrayList<IFind>();
        List<? extends ISuperFind> listF2 = new ArrayList<ISuperFind>();



    }
}
