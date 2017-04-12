package lib.files;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by V1 on 06-Apr-17.
 */
public class PPrint {
    public static String pFormat(Collection<?> c) {
        if (c.size() == 0) {  // отработали 0
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (Object o : c) {
            if (c.size() > 1) {
                sb.append("\n  ");
            }
            sb.append(o); // просто по строкам
        }
        if (c.size() > 1) {
            sb.append('\n');
        }
        sb.append(']');
        return sb.toString();
    }

    public static void print(Collection<?> c) {
        System.out.println(pFormat(c));
    }
    public static void print(Object[] objects) {
        System.out.println(pFormat(Arrays.asList(objects)));
    }
    public static void print(String string) {
        System.out.println(string);
    }

}
