package ch20.ex08.exercise;

import lib.units.atunit.TestProperty;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BaseBall<T> {
    private T val1;
    private T val2;

    public BaseBall() {
    }

    public BaseBall(T val1, T val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    private T getVal1() {
        return val1;
    }

    private T getVal2() {
        return val2;
    }

    public void put1(T val) {
        val1 = val;
    }

    public void put2(T val) {
        val2 = val;
    }

    @TestProperty
    protected T pop1() {
        return getVal1();
    }

    @TestProperty
    protected T pop2() {
        return getVal2();
    }

    @Override
    public String toString() {
        return val1 + ", " + val2;
    }
}
