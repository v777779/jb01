package ch21.ex10.codea;

/**
 * Vadim Voronov
 * Created: 29-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class InnerThread1 {
    private int countDown = 5;
    private static int threadCount = 0;
    private Inner inner;

    class Inner extends Thread {
        public Inner(String name) { // ВНИМАНИЕ запуск в конструкторе потенциально опасен
            super(name);            // задает имя потока
            start();                // запускает поток сразу же не ждет приглашения
        }

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
    }

    public InnerThread1(String name) {  // конструктор потока
        inner = new Inner(name);
    }

}
