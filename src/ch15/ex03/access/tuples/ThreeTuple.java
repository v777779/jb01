package ch15.ex03.access.tuples;

/**
 * Created by V1 on 14-Mar-17.
 */
public class ThreeTuple<A, B, C> extends TwoTuple {
    C third;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.third = c;
    }

    @Override
    public String toString() {
        return "ThreeTuple{" + first + " " + second + " " +
                third +
                '}';
    }
}
