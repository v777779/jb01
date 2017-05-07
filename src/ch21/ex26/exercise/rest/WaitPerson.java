package ch21.ex26.exercise.rest;



/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class WaitPerson implements Runnable{
    private Restaurant restaurant;

    public WaitPerson(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {  // снимает флаг
                synchronized (restaurant.mealPack) {                        // захватывает  mealPack
                    while (restaurant.mealPack.stat != MealStatus.READY) {  // пока еда не готова ждать
                        restaurant.mealPack.wait();                         // ждать mealPack.notifyAll()
                    }
                }
                System.out.print("WaitPerson got "+restaurant.mealPack.meal+" "); // ну да еду получил

                synchronized (restaurant.mealPack) {                // захватить объект chef
                    restaurant.mealPack.stat = MealStatus.TOGARBAGE;    // сбросить объект meal
                    restaurant.mealPack.notifyAll();                // вскрыть все mealPack.wait()
                }
            }

        } catch (InterruptedException e) {
            System.out.println("WaitPerson interrupted");
        }
    }
}
