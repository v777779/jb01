package ch04.ex06;

/**
 * Created by V1 on 05-Feb-17.
 */
public class Test {
    static int test(int testVal, int target) {
        if (testVal > target) {
            return 1;
        } else if (testVal < target) {
            return -1;
        }
        return 0;
    }

    static int test(int testVal, int begin, int end) {
        if (testVal >= begin && testVal <= end) {
            return 1;
        }
        return 0;
    }

}
