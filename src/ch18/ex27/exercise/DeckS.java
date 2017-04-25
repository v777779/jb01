package ch18.ex27.exercise;


import lib.generate.GenRnd;
import lib.utils.Range;

import java.io.Serializable;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class DeckS implements Serializable {
    private String name = new GenRnd.GenStr(4).next();
    private int n = Range.getInt(100);

    @Override
    public String toString() {
        return "DeckS{" + name + "." + n + '}';
    }
}
