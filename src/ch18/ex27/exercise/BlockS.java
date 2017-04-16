package ch18.ex27.exercise;

import lib.generate.GenRnd;
import lib.utils.Range;

import java.io.Serializable;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class BlockS implements Serializable {
    private String name = new GenRnd.GenStr(4).next();
    private int n = Range.getInt(100);

    private DeckS next;



    public BlockS() {
        this.next = new DeckS();
    }

    public DeckS getNext() {
        return next;
    }

    public void setNext(DeckS next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "BlockS{" + name + ":" + n + "}<>" + next.toString();
    }
}
