package lib.tuples;

/**
 * Created by V1 on 01-Apr-17.
 */
public class TuplesCmp<A,B> {
    public A first;
    public B second;


    public boolean equalsIDEA(Object o) {
        TwoTuple<A, B> twoTuple = (TwoTuple<A, B>) o;
// IDEA version
        boolean flag1;
        boolean flag2;
        if (first != null) {
            flag1 = !first.equals(twoTuple.first);
        } else {
            flag1 = twoTuple.first != null;
        }
        if (second != null) {
            flag2 = second.equals(twoTuple.second);
        } else {
            flag2 = twoTuple.second == null;
        }
        return flag1 & flag2;
    }

    public boolean equalsOfficial(Object o) {  // этот вариант наоборот
        TwoTuple<A, B> twoTuple = (TwoTuple<A, B>) o;
// Official version
        boolean flag1;
        boolean flag2;
        if (first == null) {
            flag1 = twoTuple.first == null;  // false если null <> object
        } else {
            flag1 = first.equals(twoTuple.first); // false если object <> object
        }
        if (second == null) {
            flag2 = twoTuple.second == null;  // false если null <> object
        } else {
            flag2 = second.equals(twoTuple.second); // false если object <> object
        }
        return flag1 & flag2;

    }
}
