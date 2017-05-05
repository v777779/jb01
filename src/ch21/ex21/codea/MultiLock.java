package ch21.ex21.codea;

/**
 * Vadim Voronov
 * Created: 04-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MultiLock {
    public synchronized void f1(int count) {  // перекрестный рекурсивный вызов
        if (count-- > 0) {
            System.out.println("f1() calling f2() with count "+count);
            f2(count);
        }
    }
    private synchronized void f2(int count) {
        if (count-- > 0) {
            System.out.println("f2() calling f1() with count "+ count);
            f1(count);
        }
    }

    public static void check() {
        final MultiLock multiLock = new MultiLock();
        new Thread() {  // вызвали методы
            @Override
            public void run() {
                multiLock.f1(10);
            }
        }.start();
    }

}
