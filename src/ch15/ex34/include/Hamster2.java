package ch15.ex34.include;

import lib.pets.Hamster;

/**
 * Created by V1 on 21.03.2017.
 */
public class Hamster2 extends Pet2 implements ICompareTypeII<Hamster> { // работает

    @Override
    public int compareToII(Hamster o) {
        return 0;
    }
}
