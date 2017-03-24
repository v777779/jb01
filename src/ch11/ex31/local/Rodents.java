package ch11.ex31.local;

import lib.rodent.Rodent;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Rodents  {
    protected Rodent[] rodents = Rodent.getRodent(12); // объекты

    public Rodents() {
        rodents = Rodent.getRodent(12); // объекты
    }

    public Rodents(int size) {
        this.rodents = Rodent.getRodent(size); // объекты
    }

}
