package ch17.ex40.access;

import lib.generate.GenRnd;
import lib.utils.IGenerator;

import java.util.Comparator;

/**
 * Created by V1 on 03-Apr-17.
 */
public class PairString implements Comparable<PairString>, IGenerator<PairString> {
    private String key;
    private String value;
    private IGenerator<String> gen = new GenRnd.GenStr(8);


    public PairString(int length) {
        this.key = "key";
        this.value = "value";
        gen = new GenRnd.GenStr(length);
    }

    public PairString(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static class Comp implements Comparator<PairString> {
        @Override
        public int compare(PairString o1, PairString o2) {
            return o1.value.compareTo(o2.value);
        }
    }


    @Override
    public int compareTo(PairString o) {  // сравнение только по первой строке
        return key.compareTo(o.key);
    }

    @Override
    public PairString next() {
        return new PairString(gen.next(), gen.next());
    }

    @Override
    public String toString() {
        return "[" + key + ":" + value + ']';
    }
}
