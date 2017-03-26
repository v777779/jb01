package ch16.ex15.access;

import lib.utils.BerylliumSphere;
import lib.utils.IGenerator;

/**
 * Created by V1 on 26.03.2017.
 */
public class GenB {
    public class GenBer implements IGenerator<BerylliumSphere> {
        @Override
        public BerylliumSphere next() {
            return new BerylliumSphere();
        }
    }

    public BerylliumSphere[] get(int size) {
        BerylliumSphere[] array = new BerylliumSphere[size];
        GenBer cg = new GenBer();
        for (int i = 0; i < array.length; i++) {
            array[i] = cg.next();
        }
        return array;
    }



}
