package ch21.ex26.exercise.rest;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BusBoy implements Runnable {
    private Restaurant restaurant;

    public BusBoy(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (restaurant.mealPack) {                            // здесь активно используется while()
                    while (restaurant.mealPack.stat != MealStatus.TOGARBAGE) {  // выдается множественный mealPack.notifyAll()
                        restaurant.mealPack.wait();   // перехватить кто не должен сработать может только while
                    }
                }
                System.out.println("removed "+restaurant.mealPack.meal+"...");

                synchronized (restaurant.mealPack) {
                    restaurant.mealPack.meal = null;
                    restaurant.mealPack.stat = MealStatus.EMPTY;
                    restaurant.mealPack.notifyAll();  // выдаем всем,  а сидят в нем все сразу по разным while()
                }

//            TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("BusBoy interrupted");
        }


    }


}
