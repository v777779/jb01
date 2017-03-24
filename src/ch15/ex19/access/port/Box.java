package ch.ex19.access.port;

import lib.utils.IGenerator;

import java.util.Random;

/**
 * Created by V1 on 17.03.2017.
 */
public class Box {
    public static int countCargo = 1;
    public static int countPlace = 1;
    private final int id;
    private String description;
    private double weight;
    private double heigth;
    private double width;
    private double length;
    private final int cargo = countCargo;
    private final int place = countPlace++;

    public Box(int id, String description, double heigth, double width, double length, double kweight) { //
        this.id = id;
        this.description = description;
        this.heigth = heigth;
        this.width = width;
        this.length = length;
        this.weight = heigth*width*length*kweight;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format("%s:%-4d addr: %d_%d dim:[%3.0fx%3.0fx%3.0f] weight: %6.1f",
                 description,id, cargo, place, heigth, width, length, weight);
    }

    public static IGenerator<Box> generator() {
        return new IGenerator<Box>() {
            private Random rnd = new Random();
            @Override
            public Box next() {
                return new Box(rnd.nextInt(1000), "BoxPlace",
                        (rnd.nextDouble() * 100.0) + 0.50,
                        (rnd.nextDouble() * 100.0) + 0.50,
                        (rnd.nextDouble() * 100.0) + 0.50,
                        (rnd.nextDouble() * 0.007) + 0.001
                ) ;  // вес не более 100кГ, не менее 0.5
            }
        };
    }

}
