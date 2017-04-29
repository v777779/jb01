package ch21.ex10.codea;

/**
 * Vadim Voronov
 * Created: 29-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ThreadMethod {
    private int countDown = 5;
    private String name;
    private Thread t;  // поток

    public ThreadMethod(String name) { // ВНИМАНИЕ запуск в конструкторе потенциально опасен
        this.name = name;
    }

    public void runTask() {
        if (t == null) {
            t = new Thread(name) {  // переопределяем метод Thread{}
                @Override
                public void run() {  // переопределяем метод run()
                    try {
                        while (true) {  // бесконечный цикл
                            System.out.println(this);   // падаем в свою же toString "#"+..
                            if (--countDown == 0) {
                                sleep(10);
                                return;                 // выпрыгиваем из цикла
                            }
                        }
                    } catch (InterruptedException e) {
                        System.out.println("sleep() interrupted");
                    }
                }

                @Override
                public String toString() {
                    return "#" + getName() + ": " + countDown;  // распечатка параметров потока
                }
            };
            t.start(); // запустили
        } // if
    } // вышли из метода runTask()
}
