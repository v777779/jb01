package ch07.ex14;

import ch07.ex14.local.Car;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Ex14 {
    public static void main(String[] args) {
        System.out.println("\nAggregation Function Check\n");
        Car car = new Car();
//        car.leftDoor.window.rollup();      // машина > левая дверь > окно > поднять
        car.leftDoorWinUp();
//       car.wheels[0].inflate(72);         // машина > колесо[0] > накачать
        car.inflateWheels(72);
        car.getServiceEngine();
    }
}
