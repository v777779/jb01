package ch21.ex10.codea;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 29-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class InnerRunnable2 {
    private int countDown = 5;
    private Thread t;

    public InnerRunnable2(String name) {  // конструктор потока

        t = new Thread(new Runnable() {// анонимный класс переопределяет методы базового класса
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
        },name);  // второй аргумент Thread
        t.start();
    }  // завершение конструктора


}
