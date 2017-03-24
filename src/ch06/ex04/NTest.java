package ch06.ex04;

import lib.utils.Test;
import static lib.utils.Print.pp;

/**
 * Created by V1 on 07-Feb-17.
 */
public class NTest extends Test {
    public int getProtected() {
        pp("direct protected value: ");
        return iProtected;
    }

    public int getDefault() {
        pp("getter() default value: ");
        return super.getDefault();  // только через метод
    }

    public int getPrivate() {
        pp("getter() private value: ");
        return super.getPrivate();  // только через метод
    }

    public void show() {
        showProtected();
        showGetDefault();
    }
}
