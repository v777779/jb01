package ch19.ex12.codeb;

import lib.utils.ICompetitor;
import lib.utils.Outcome;

import java.util.Random;

import static lib.utils.Outcome.*;


/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public enum RoShamBo2 implements ICompetitor<RoShamBo2> {
    PAPER(DRAW, LOSE, WIN),
    SCISSORS(WIN, DRAW, LOSE),
    ROCK(LOSE, WIN, DRAW);

    private static Random rnd = new Random();
    private Outcome vPaper, vScissors, vRock;

    RoShamBo2(Outcome vPaper, Outcome vScissors, Outcome vRock) {
        this.vPaper = vPaper;
        this.vScissors = vScissors;
        this.vRock = vRock;
    }

    @Override
    public Outcome compete(RoShamBo2 item) {
        switch (item) {
            default:
            case PAPER:
                return vPaper;
            case SCISSORS:
                return vScissors;
            case ROCK:
                return vRock;
        }
    }

    private static RoShamBo2 newItem() {
        return values()[rnd.nextInt(values().length)];
    }

    private static void match(RoShamBo2 a, RoShamBo2 b) {
        System.out.printf("%-10s vs  %-10s : %s\n", a, b, a.compete(b));
    }

    public static void check() {
        System.out.println("Standard Variant:");
        RoShambo.play(RoShamBo2.class, 20);

        System.out.println("\nHome variant:");
        for (int i = 0; i < 20; i++) {
            match(newItem(), newItem());
        }
    }
}
