package ch17.ex42.access;

import lib.generate.GenRnd;
import lib.utils.IGenerator;

import java.util.Comparator;

/**
 * Created by V1 on 03-Apr-17.
 */
public class PairString3 implements Comparable<PairString3>, IGenerator<PairString3> {
    private String key;
    private String value;
    private IGenerator<String> gen = new GenRnd.GenStr(8);


    public PairString3(int length) {
        this.key = "key";
        this.value = "value";
        gen = new GenRnd.GenStr(length);
    }

    public PairString3(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static class Comp implements Comparator<PairString3> {
        @Override
        public int compare(PairString3 o1, PairString3 o2) {
            return o1.value.toLowerCase().compareTo(o2.value.toLowerCase());
        }
    }


    @Override
    public int compareTo(PairString3 o) {  // сравнение только по первой строке
        return key.toLowerCase().compareTo(o.key.toLowerCase());
    }

    @Override
    public PairString3 next() {
        return new PairString3(gen.next(), gen.next());
    }

    @Override
    public String toString() {
        return "[" + key + ":" + value + ']';
    }
}
