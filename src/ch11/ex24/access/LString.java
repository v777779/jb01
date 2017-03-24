package ch11.ex24.access;

/**
 * Created by V1 on 27-Feb-17.
 */
public class LString implements Comparable <LString> {
    String key;
    String val;

    public LString(String key, String val) {
        this.key = key;
        this.val = val;
    }

    @Override
    public int compareTo(LString o) {  // сравнение и сортировка по ключу
        return key.compareTo(o.key);
    }
}
