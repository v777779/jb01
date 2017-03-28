package ch17.ex09.local;

/**
 * Created by V1 on 28-Mar-17.
 */
public class TreeType extends SetType implements Comparable<TreeType>{  // расширение SetType

    public TreeType(int i) {
        super(i);
    }
    @Override
    public int compareTo(TreeType arg) { // от предка SetType
        if (arg.i < i) {
            return -1;
        }
        if (arg.i > i) {
            return 1;
        }
        return 0;
    }
}
