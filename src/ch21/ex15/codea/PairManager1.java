package ch21.ex15.codea;

/**
 * Vadim Voronov
 * Created: 02-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class PairManager1 extends PairManager {
    @Override
    public synchronized void increment() {  // делается синхронным
        p.incrementX();
        p.incrementY();
        store(getPair());  // инкрементируем и сохраняем копию в список
    }
}
