package ch17.ex41.access;

import lib.generate.GenRnd;
import lib.utils.IGenerator;

/**
 * Created by V1 on 03-Apr-17.
 */
public class PairString2 implements Comparable<PairString2>, IGenerator<PairString2> {
    private String key;
    private String value;
    private IGenerator<String> gen = new GenRnd.GenStr(8);


    public PairString2(int length) {
        this.key = "key";
        this.value = "value";
        gen = new GenRnd.GenStr(length);
    }

    public PairString2(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PairString2)) return false;

        PairString2 that = (PairString2) o;

        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(PairString2 o) {  // сравнение только по первой строке
        int cmp = key.compareTo(o.key);
        if (cmp != 0) {
            return cmp;
        }
        return value.compareTo(o.value);
    }

    @Override
    public PairString2 next() {
        return new PairString2(gen.next(), gen.next());
    }

    @Override
    public String toString() {
        return "[" + key + ":" + value + ']';
    }
}
