package ch.ex20.local;

import java.util.ArrayList;

/**
 * Created by V1 on 17.03.2017.
 */
public class ErasedType {

    public <T,V> boolean compare (ArrayList<T> listT, ArrayList<V> listV) {
        return listT.getClass() == listV.getClass();
    }

}
