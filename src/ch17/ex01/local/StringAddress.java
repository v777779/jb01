package ch17.ex01.local;

/**
 * Created by V1 on 3/27/2017.
 */
public class StringAddress {
    private int count = 0;
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        String s = super.toString()+this.s;
        if (++count % 2 == 0) {
            s += "\n";
        }
        return s;
    }
}
