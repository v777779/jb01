package ch14.ex11.local;

import lib.utils.Range;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Initable {
    static final int staticFinal= 12;
    static int staticFinal2 = Range.getInt(100); // with static method

    static {
        System.out.println("Load Initable");
    }
}
