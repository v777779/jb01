package ch.ex15.local.tuples;

/**
 * Created by V1 on 14-Mar-17.
 */
public class FiveTuple<A, B, C, D, E> extends FourTuple {
    E fifth;

    public FiveTuple(A a, B b, C c, D d, E e) {
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
