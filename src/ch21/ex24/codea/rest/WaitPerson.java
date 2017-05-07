package ch21.ex24.codea.rest;

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
                synchronized (this) {                   // захватывает объект чтобы проверить готовность
                    while (restaurant.meal == null) {   // еда не готова
                        wait();                         // this отпустить и сидеть в wait
                    }
                }
                System.out.println("WaitPerson got "+restaurant.meal); // ну да еду получил

                synchronized (restaurant.chef) {        // захватить объект chef
                    restaurant.meal = null;             // сбросить объект meal
                    restaurant.chef.notifyAll();        // оповестили всех что chef свободен
                }
            }

        } catch (InterruptedException e) {
            System.out.println("WaitPerson interrupted");
        }
    }
}
