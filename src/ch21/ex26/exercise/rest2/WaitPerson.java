package ch21.ex26.exercise.rest2;


/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class WaitPerson implements Runnable{
    private Restaurant2 restaurant;

    public WaitPerson(Restaurant2 restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {  // снимает флаг
                synchronized (this) {                                       // waitPerson ждет
                    while (restaurant.mealPack.stat != MealStatus.READY) {
                        wait();                                             // this.wait ждет waitPerson.notifyAll
                    }
                }
                System.out.print("WaitPerson got "+restaurant.mealPack.meal+" "); // ну да еду получил

                synchronized (restaurant.busBoy) {                          // захватить busBoy
                    synchronized (restaurant.chef) {                        // захватить объект chef
                        restaurant.mealPack.stat = MealStatus.TOGARBAGE;    // статус на BusBoy
                        restaurant.chef.notifyAll();                        // оповестили chef.wait()
                    }
                    restaurant.busBoy.notifyAll();                          // оповестили busBoy.wait()
                }
            }

        } catch (InterruptedException e) {
            System.out.println("WaitPerson interrupted");
        }
    }
}
