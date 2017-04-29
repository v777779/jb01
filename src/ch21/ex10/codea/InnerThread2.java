package ch21.ex10.codea;

/**
 * Vadim Voronov
 * Created: 29-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class InnerThread2 {
    private int countDown = 5;
    private static int threadCount = 0;
    private Thread t;

    public InnerThread2(String name) {  // конструктор потока

        t = new Thread(name) {  // анонимный класс переопределяет методы базового класса
            @Override
            public void run() {  // переопределяем метод run()
                try {
                    while (true) {  // бесконечный цикл
                        System.out.println(this);   // падаем в свою же toString "#"+..
                        if (--countDown == 0) {
                            return;                 // выпрыгиваем из цикла
                        }
                        sleep(10);
                    }
                } catch (InterruptedException e) {
                    System.out.println("sleep() interrupted");
                }
            }

            @Override
            public String toString() {
                return getName() + ": " + countDown;
            }
        };
        t.start();
    }  // завершение конструктора


}
