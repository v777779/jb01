package ch18.ex27.codec;

import java.io.Serializable;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class DataS implements Serializable {
    private int n;

    public DataS(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return Integer.toString(n);
    }
}
