package ch19.ex12.codec;

import ch19.ex12.codeb.RoShambo;
import lib.utils.ICompetitor;
import lib.utils.Outcome;

import static lib.utils.Outcome.*;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public enum RoShamBo3 implements ICompetitor<RoShamBo3>{
    PAPER {
        public Outcome compete(RoShamBo3 item) {
            switch (item) {
                default:
                case PAPER:
                    return DRAW;
                case SCISSORS:
                    return LOSE;
                case ROCK:
                    return WIN;
            }
        }
    },
    SCISSORS {
        public Outcome compete(RoShamBo3 item) {
            switch (item) {
                default:
                case PAPER:
                    return WIN;
                case SCISSORS:
                    return DRAW;
                case ROCK:
                    return LOSE;
            }
        }
    },
    ROCK {
        public Outcome compete(RoShamBo3 item) {
            switch (item) {
                default:
                case PAPER:
                    return LOSE;
                case SCISSORS:
                    return WIN;
                case ROCK:
                    return DRAW;
            }
        }
    };

    public abstract Outcome compete(RoShamBo3 item);

    public static void check() {
        RoShambo.play(RoShamBo3.class,20);
    }


}
