package ch21.ex36.exercise.restaurant;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class RestaurantWithQueues {

    public static void check() {
        final int MAX_TABLES = 5;
        final int MAX_WAITERS = 5;
        final int MAX_CHEFS = 4;

        ExecutorService exec = Executors.newSingleThreadExecutor();
        Restaurant restaurant = new Restaurant(Executors.newCachedThreadPool(),MAX_WAITERS,MAX_CHEFS, MAX_TABLES);
        exec.execute(restaurant);
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
//            System.out.println("Press 'Enter' to stop");
//            System.in.read();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        exec.shutdownNow();  // close


    }
}
