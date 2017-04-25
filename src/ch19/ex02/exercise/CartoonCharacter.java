package ch19.ex02.exercise;

import lib.utils.IGenerator;

import java.util.Random;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public enum CartoonCharacter implements IGenerator<CartoonCharacter> {
    SLAPPY, SPANKY, PUNCHY, STILLY, BOUNCY, NUTTY, BOB;
    private static Random rnd = new Random();

    public CartoonCharacter next() {
        return values()[rnd.nextInt(values().length)];
    }

    public static CartoonCharacter next2() {
        return values()[rnd.nextInt(values().length)];
    }
}
