package ch11.ex04.remote;

import java.util.Collection;

/**
 * Created by V1 on 20-Feb-17.
 */
public interface IMovie {
    void gen(Collection c);
    String next(Collection c);
    void show(Collection c);
    void setup(Collection c);

}
