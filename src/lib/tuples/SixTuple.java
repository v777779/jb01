package lib.tuples;

/**
 * Created by V1 on 14-Mar-17.
 */
public class SixTuple<A, B, C, D, E, F> extends FiveTuple {
    F sixth;

    public SixTuple(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        this.sixth = f;
    }

    @Override
    public String toString() {
        return "SixTuple{ [" + first + "] [" + second + "] [" +
                third + "] [" + fourth +"] ["+fifth+ "] [" +
                sixth + "] }";
    }
}
