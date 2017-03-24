package ch.ex34.include;

import lib.pets.Cat;

/**
 * Created by V1 on 21.03.2017.
 */
public class Cat2 extends Pet2 implements ICompareTypeI<Cat> { // работает

    @Override
    public int compareToI(Cat o) {
        return 0;
    }
}
