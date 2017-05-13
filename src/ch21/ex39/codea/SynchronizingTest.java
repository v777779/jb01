package ch21.ex39.codea;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SynchronizingTest extends Incrementable {
    @Override
    public synchronized void increment() {
        counter++;// переменная входит в состав абстрактного класса
    }
}
