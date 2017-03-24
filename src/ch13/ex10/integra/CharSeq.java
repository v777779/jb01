package ch13.ex10.integra;

/**
 * Created by V1 on 06-Mar-17.
 */
public class CharSeq implements CharSequence {
    String s;

    public CharSeq(String s) {
        this.s = s;
    }

    @Override
    public int length() {
        return s.length();
    }

    @Override
    public char charAt(int index) {
        return s.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return s.substring(start,end);
    }

    @Override
    public String toString() {
        return s;
    }
}
