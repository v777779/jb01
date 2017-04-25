package ch19.ex12.codee;

import ch19.ex12.codeb.RoShambo;
import lib.utils.ICompetitor;
import lib.utils.Outcome;

import static lib.utils.Outcome.*;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public enum RoShambo6 implements ICompetitor<RoShambo6> {
    PAPER, SCISSORS, ROCK;

    private static Outcome[][] array = {  // исключительно простое решение
            {DRAW, LOSE, WIN},
            {WIN, DRAW, LOSE},
            {LOSE, WIN, DRAW}
    };

    @Override
    public Outcome compete(RoShambo6 item) {
        return array[this.ordinal()][item.ordinal()];
    }

    public static void check() {
        RoShambo.play(RoShambo6.class,20);
    }

}
