package ch.ex3.access.tuples;

/**
 * Created by V1 on 14-Mar-17.
 */
public class TwoTuple<A,B> {
   public final A first;
   public B second;


    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "TwoTuple{" + first + " " + second +
                '}';
    }
}
