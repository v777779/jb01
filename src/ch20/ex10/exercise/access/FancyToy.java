package ch20.ex10.exercise.access;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 08-Mar-17.
 */
public class FancyToy extends Toy implements HasBattery, WaterProof, Shoots, OnTable {
    public FancyToy() {
        super(1);
    }

    static {
        System.out.println("Load: FancyToy");
    }

}
