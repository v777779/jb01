package ch21.ex15.codea;

/**
 * Vadim Voronov
 * Created: 02-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class PairManipulator implements Runnable{
    private PairManager pm;


    public PairManipulator(PairManager pm) {
        this.pm = pm;
    }


    @Override
    public void run() {
        while (true) {
            pm.increment();
            if (PairManager.state()) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Pair: "+pm.getPair()+" checkCounter = "+pm.checkCounter.get();
    }
}
