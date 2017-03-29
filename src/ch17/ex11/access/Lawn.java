package ch17.ex11.access;

import lib.utils.IGenerator;

import java.util.Random;

/**
 * Created by V1 on 29-Mar-17.
 */
public class Lawn implements Comparable<Lawn>, IGenerator<Lawn> {
    private int value;
    private Random rnd = new Random();

    public Lawn() {
        this.value = rnd.nextInt(100);
    }


    @Override
    public int compareTo(Lawn o) {
        if (value > o.value) {
            return 1;
        }
        if (value < o.value) {
            return -1;
        }
        return 0;
    }

    @Override
    public Lawn next() {
        return new Lawn();
    }

    public Lawn[] generator(int size) {
        Lawn[] lawns = new Lawn[size];
        for (int i = 0; i < size; i++) {
            lawns[i]= next();
        }
        return lawns;
    }

    @Override
    public String toString() {
        return "Lawn{"+value+"}";
    }
}
