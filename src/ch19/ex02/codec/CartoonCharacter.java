package ch19.ex02.codec;

import lib.utils.IGenerator;

import java.util.Random;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public enum CartoonCharacter implements IGenerator<CartoonCharacter> {
    SLAPPY, SPANKY, PUNCHY, STILLY, BOUNCY, NUTTY, BOB;
    private Random rnd = new Random();

    @Override
    public CartoonCharacter next() {
        return values()[rnd.nextInt(values().length)];
    }
}
