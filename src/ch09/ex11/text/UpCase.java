package ch09.ex11.text;

/**
 * Created by V1 on 13-Feb-17.
 */
public class UpCase  extends  StringProcessor{

    @Override
    public String process(Object object) {
        return object.toString().toUpperCase();
    }

    @Override
    public String toString() {
        return "UpCase{}";
    }
}
