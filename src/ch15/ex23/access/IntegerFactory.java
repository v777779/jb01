package ch.ex23.access;

/**
 * Created by V1 on 17.03.2017.
 */
public class IntegerFactory implements IFactory2<Integer, Integer> {

    @Override
    public Integer create(Integer integer) {
        return new Integer(integer);
    }
}
