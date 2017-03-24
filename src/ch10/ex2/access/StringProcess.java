package ch10.ex2.access;

/**
 * Created by V1 on 14-Feb-17.
 */
public class StringProcess {
    String s;

    public StringProcess(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "StringProcess{" +
                "s='" + s + '\'' +
                '}';
    }
}
