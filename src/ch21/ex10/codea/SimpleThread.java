package ch21.ex10.codea;

/**
 * Vadim Voronov
 * Created: 29-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SimpleThread extends Thread{
    private int countDown = 5;
    private static int threadCount = 0;

    public SimpleThread() { // ВНИМАНИЕ запуск в конструкторе потенциально опасен
        super(Integer.toString(++threadCount)); // задает имя потока
        start();  // запускает поток сразу же не ждет приглашения
    }


    @Override
    public void run() {  // переопределяем метод run()
        while (true) {  // бесконечный цикл
            System.out.println(this);   // падаем в свою же toString "#"+..
            if (--countDown == 0) {
                return;                 // выпрыгиваем из цикла
            }
        }
    }

    public static void check() {
        for (int i = 0; i < 5; i++) {
            new SimpleThread(); // сразу и запуск и все остальное

        }
    }

    @Override
    public String toString() {
        return "#"+getName()+"("+countDown +"), ";  // распечатка параметров потока
    }
}
