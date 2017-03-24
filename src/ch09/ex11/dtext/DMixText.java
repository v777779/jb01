package ch09.ex11.dtext;

/**
 * Created by V1 on 13-Feb-17.
 */
public class DMixText extends DStringProcessor {

    @Override
    public Object process(Object object) {
        char[] c = ((String) object).toCharArray();
        String s = "";

        if (c.length < 2) return object;

        for (int i = 0; i < c.length-1 ; i += 2) {

            char c2 = c[i];
            c[i] = c[i+1];
            c[i+1] = c2;
        }
        return  String.valueOf(c);
}

    @Override
    public String toString() {
        return "DMixText{}";
    }
}
