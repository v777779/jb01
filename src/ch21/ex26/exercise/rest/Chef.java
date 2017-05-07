package ch21.ex26.exercise.rest;

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
                synchronized (restaurant.mealPack) {                          // захватить объект mealPack
                    while (restaurant.mealPack.stat != MealStatus.EMPTY) {    // попадаем сюда всегда, кроме EMPTY
                        restaurant.mealPack.wait();                           // и его же, mealPack подвесить
                    }
                }

                if (++count >= 10) {
                    System.out.println("Out of food, closing");
                    restaurant.exec.shutdownNow(); // interrupt() >> all  отрубить все службы

                }
                System.out.print("Order up! ");
                synchronized (restaurant.mealPack) {            // захватить того кому будем посылать уведомление
                    restaurant.mealPack.meal = new Meal(count); // подготовить блюдо
                    restaurant.mealPack.stat = MealStatus.READY;// готово блюдо
                    restaurant.mealPack.notifyAll();            // вскрываем все объекты mealPack.wait()
                }


                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Chef interrupted");
        }


    }
}
