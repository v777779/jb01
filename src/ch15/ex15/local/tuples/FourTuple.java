package ch.ex15.local.tuples;

/**
 * Created by V1 on 14-Mar-17.
 */
public class FourTuple<A, B, C, D> extends ThreeTuple {
   final D fourth;

    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        this.fourth = d;
    }

    @Override
    public String toString() {
        return "FourTuple{" + first + " " + second + " " +
                third + " " + fourth +
                '}';
    }
}
