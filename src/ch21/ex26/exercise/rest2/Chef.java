package ch21.ex26.exercise.rest2;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Chef implements Runnable {
    private Restaurant2 restaurant;
    private int count = 0;

    public Chef(Restaurant2 restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {                           // захватить this
                    while (restaurant.mealPack.stat != MealStatus.EMPTY) {    // попадаем сюда всегда, кроме EMPTY
                        wait();                                 // и его же, mealPack подвесить
                    }
                }

                if (++count >= 10) {
                    System.out.println("Out of food, closing");
                    restaurant.exec.shutdownNow(); // interrupt() >> all  отрубить все службы

                }

                System.out.print("Order up! ");
                synchronized (restaurant.waitPerson) {
                    synchronized (restaurant.busBoy) {              // захватить всех кому посылаем уведомление
                        restaurant.mealPack.meal = new Meal(count); // блокировка тута
                        restaurant.mealPack.stat = MealStatus.READY;// готово блюдо
                        restaurant.busBoy.notifyAll();
                    }
                    restaurant.waitPerson.notifyAll();                  // вскрываем все объекты mealPack.wait()
                }

                    TimeUnit.MILLISECONDS.sleep(100);
                }
            } catch(InterruptedException e){
                System.out.println("Chef interrupted");
            }


        }
    }
