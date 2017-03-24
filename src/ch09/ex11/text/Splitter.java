package ch.ex11.text;

import java.util.Arrays;

/**
 * Created by V1 on 13-Feb-17.
 */
public class Splitter extends StringProcessor {
    @Override
    public Object process(Object object) {
        return Arrays.toString(object.toString().split(" "));
    }

    @Override
    public String toString() {
        return "Splitter{}";
    }
}
