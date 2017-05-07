package ch21.ex26.exercise.rest2;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BusBoy implements Runnable {
    private Restaurant2 restaurant;

    public BusBoy(Restaurant2 restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {                                           // захватить this (busBoy)
                    while (restaurant.mealPack.stat != MealStatus.TOGARBAGE) {  // ждем пока не будет вызова
                        wait();                                                 // this.wait() ждет busBoy.notifyAll()
                    }
                }
                System.out.println("removed " + restaurant.mealPack.meal + "...");

                synchronized (restaurant.chef) {
                    synchronized (restaurant.waitPerson) {
                        restaurant.mealPack.meal = null;
                        restaurant.mealPack.stat = MealStatus.EMPTY;
                        restaurant.waitPerson.notifyAll();
                    }
                    restaurant.chef.notifyAll();
                }

            }
        } catch (InterruptedException e) {
            System.out.println("BusBoy interrupted");
        }


    }


}
