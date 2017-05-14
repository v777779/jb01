package lib.units.util;

import java.util.AbstractList;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CountingIntegerList extends AbstractList<Integer> {
    private int size;

    public CountingIntegerList(int size) {
        this.size = size < 0 ? 0 : size;
    }

    public Integer get(int index) {
        return Integer.valueOf(index);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new CountingIntegerList(30));
    }

}
