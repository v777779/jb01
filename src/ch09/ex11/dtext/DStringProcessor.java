package ch.ex11.dtext;

/**
 * Created by V1 on 13-Feb-17.
 */
abstract public class DStringProcessor implements IProcessor {
    public String s = "Test Case Local MNap";

    @Override
    public Object getData() {
        return s;
    }
    @Override
    public String name() {
         return getClass().getSimpleName(); // get simple Name of Class
    }

}
