package ch.ex11.dtext;

import java.util.Arrays;

/**
 * Created by V1 on 13-Feb-17.
 */
public class DSplitter extends DStringProcessor {
    @Override
    public Object process(Object object) {
        return Arrays.toString(object.toString().split(" "));
    }

    @Override
    public String toString() {
        return "DSplitter{}";
    }
}
