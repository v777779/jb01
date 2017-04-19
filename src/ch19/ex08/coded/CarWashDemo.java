package ch19.ex08.coded;

import static ch19.ex08.coded.CarWash.*;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class CarWashDemo {
    public static void check() {
        CarWash carWash = new CarWash();

        System.out.println("Wash Basic values:");
        System.out.println(carWash);
        carWash.washCar();
        System.out.println("\nWash Extended values:");
        carWash.add(Cycle.BLOWDRY);
        carWash.add(Cycle.BLOWDRY);  // проверка на дубликаты
        carWash.add(Cycle.RINSE);  // тоже самое на дубликаты
        carWash.add(Cycle.HOTWAX);
        System.out.println(carWash);
        carWash.washCar();

    }
}
