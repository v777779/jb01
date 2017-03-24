package ch.ex3.access.tuples;

/**
 * Created by V1 on 14-Mar-17.
 */
public class SixTuple<A, B, C, D, E> extends FourTuple {
    E fifth;

    public SixTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        this.fifth = e;
    }

    @Override
    public String toString() {
        return "FiveTuple{ [" + first + "] [" + second + "] [" +
                third + "] [" + fourth +"] ["+fifth+
                "] }";
    }
}
