package ch15.ex21.integra;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 17.03.2017.
 */
public class ListMaker<T> {
    public List<T> create() {
        return new ArrayList<T>();
    }
}
