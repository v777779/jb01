package ch11.ex12.local;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by V1 on 26-Feb-17.
 */
public class Clamp {
    private final String[] S_ARRAY = new String[]{
            "ZIP",
            "file",
            "format",
            "popular",
            "lossless",
            "data",
            "compression",
            "archival",
            "created",
            "contains"
    };
    private Random rnd = new Random();
    String name;
    int code;

    public Clamp(int code) {
        this.name = S_ARRAY[rnd.nextInt(S_ARRAY.length)];
        this.code = code;
    }

    public static List<Clamp> getList(int size) {
        ArrayList<Clamp> aList = new ArrayList<>();
        for (int i = 0; i <size ; i++) {
            aList.add(new Clamp(i));    // code is the number of Element
        }
        return aList;
    }
}
