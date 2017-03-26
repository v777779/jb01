package ch16.ex15.access;

import lib.utils.BerylliumSphere;
import lib.utils.IGenerator;

/**
 * Created by V1 on 26.03.2017.
 */
public class GenBer implements IGenerator<BerylliumSphere> {
    @Override
    public BerylliumSphere next() {
        return new BerylliumSphere();
    }

}
