package ch21.ex24.codea.rest;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Chef implements Runnable{
    private Restaurant restaurant;
    private int count = 0;

    public Chef(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {                // постоянно заходит проверить готовность
                    while (restaurant.meal != null) {  // блюдо готово захватить объект this и ждать
                        wait();                      // отпустить объект this и сидеть в wait() по this
                    }
                }

                if (++count >= 10) {
                    System.out.println("Out of food, closing");
                    restaurant.exec.shutdownNow(); // interrupt() >> all  отрубить все службы
                }
                System.out.print("Order up! ");
                synchronized (restaurant.waitPerson) { // захватить waitPerson
                    restaurant.meal = new Meal(count); // подготовить блюдо
                    restaurant.waitPerson.notifyAll(); // оповестить всех кто сидит в wait() по waitPerrson
                }


                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Chef interrupted");
        }


    }
}
