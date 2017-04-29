package ch21.ex10.codea;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 29-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class InnerRunnable1 {
    private int countDown = 5;
    private static int threadCount = 0;
    private Inner inner;

    class Inner implements Runnable {
        Thread t;
        public Inner(String name) {          // ВНИМАНИЕ запуск в конструкторе потенциально опасен
            t = new Thread(this,name); // создание потока на базе Runnable и задание имени
            t.start();                       // запускает поток сразу же не ждет приглашения
        }

        @Override
        public void run() {  // переопределяем метод run()
            try {
                while (true) {  // бесконечный цикл
                    System.out.println(this);   // падаем в свою же toString "#"+..
                    if (--countDown == 0) {
                        return;                 // выпрыгиваем из цикла
                    }
                    TimeUnit.MILLISECONDS.sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println("sleep() interrupted");
            }
        }

        @Override
        public String toString() {
            return t.getName() + ": " + countDown;
        }
    }

    public InnerRunnable1(String name) {  // конструктор потока
        inner = new Inner(name);
    }

}
