package ch21.ex39.codeb;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BaseLine extends Accumulator {
    {
        id = "BaseLine";
    }

    @Override
    public void accumulate() {
        value += preloaded[index++];
        if (index >= SIZE) {
            index = 0;
        }
    }

    @Override
    public long read() {
        return value;
    }
}
