package ch15.ex22.include;

import lib.utils.IFactory;

/**
 * Created by V1 on 17.03.2017.
 */
public class IntegerFactory implements IFactory<Integer> {

    @Override
    public Integer create() {
        return new Integer(0);
    }
}
