package ch15.ex19.access.port;

import lib.utils.Generators;

import java.util.ArrayList;

/**
 * Created by V1 on 17.03.2017.
 */
public class Cargo extends ArrayList<Box> {
    private int cargo;
    public Cargo(int cargo, int nProducts) {
        this.cargo = cargo;
        Box.countPlace = 1;
        Box.countCargo = cargo;
        Generators.fill(this, Box.generator(), nProducts);  // конструктор генерит список
    }

    public int getCargo() {
        return cargo;
    }
}
