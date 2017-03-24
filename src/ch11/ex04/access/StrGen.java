package ch11.ex04.access;

import java.util.Collection;

/**
 * Created by V1 on 20-Feb-17.
 */
public class StrGen extends Movies {
    private int index = 0;

    String next() {
        if (index == S_NAMES.length) {
            index = 0;
        }
        return S_NAMES[index++];
    }

    String [] fillArray(String[] s) {
        for (int i = 0; i < s.length; i++) {
                  s[i] = next();
        }
        return s;
    }

    Collection fillCollect(Collection<String> c, int n) {
        for (int i = 0; i < n ; i++) {
            c.add(next());
        }
        return c;
    }

}
