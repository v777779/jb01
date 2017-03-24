package ch06.ex1;


import lib.utils.ArrayUtils;

/**
 * Created by V1 on 07-Feb-17.
 */
class Echo extends ArrayUtils {
    void show() {
        System.out.println("Show from Echo2");
    }
    int getInt2() {
        return this.i2;
    }

    Character[] getCh(String s) {
        return this.toObject(s);
    }

}
