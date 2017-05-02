package ch21.ex15.codea;

/**
 * Vadim Voronov
 * Created: 02-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class PairManager2 extends PairManager {
    @Override
    public void increment() {  // делается синхронным
        Pair temp;
        synchronized (this) {
            p.incrementX();
            p.incrementY();
            temp = getPair();  // сохраняем копию в объект
            store(temp); // store метод несинхронный, но в блоке sync доступы низкие
        }
//        store(temp); // store метод несинхронный, здесь доступы растут
    }
}
