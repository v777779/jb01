package ch19.ex12.codea;

import static ch19.ex12.codea.Outcome.*;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public class Rock implements IItem {
    @Override
    public Outcome compete(IItem i) {
        return i.eval(this);
    }

    @Override
    public Outcome eval(Papers p) {
        return WIN;
    }

    @Override
    public Outcome eval(Scissors s) {
        return LOSE;
    }

    @Override
    public Outcome eval(Rock r) {
        return DRAW;
    }

    @Override
    public String toString() {
        return "Rock";
    }
}
