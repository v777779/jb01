package ch17.ex09.local;

/**
 * Created by V1 on 28-Mar-17.
 */
public class HashType extends SetType{  // расширение SetType

    public HashType(int i) {
        super(i);
    }

    public int hashCode() { // от предка SetType
        return i;
    }


}
