package ch15.ex13.local;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 16.03.2017.
 */
public class GenArgs {
    public static <T> List<T> getList(T...args) {
        List<T> list = new ArrayList<>();
        for (T arg : args) {
            list.add(arg);
        }
        return list;
    }

}
