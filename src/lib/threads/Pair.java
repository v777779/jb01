package lib.threads;

/**
 * Vadim Voronov
 * Created: 02-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Pair {
    private int x;
    private int y;

    public class PairValuesNotEqualException extends RuntimeException {
        public PairValuesNotEqualException() {
            super("Pair values not equal: "+ Pair.this);  // обращение к суперклассу
        }
    }

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pair() {
        x = 0;
        y = 0;
    }


    public int getX() {
        return x;
    }

    public void incrementX() {
        x++;
    }

    public int getY() {
        return y;
    }

    public void incrementY() {
        y++;
    }

    public void checkState() {
        if (x != y) {
            throw new PairValuesNotEqualException(); // сгенерить Custom Exception
        }
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
    }


}
