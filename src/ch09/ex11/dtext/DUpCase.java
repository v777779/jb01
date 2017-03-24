package ch09.ex11.dtext;

/**
 * Created by V1 on 13-Feb-17.
 */
public class DUpCase extends DStringProcessor {

    @Override
    public String process(Object object) {
        return object.toString().toUpperCase();
    }

    @Override
    public String toString() {
        return "DUpCase{}";
    }
}
