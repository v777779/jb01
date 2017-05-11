package ch21.ex36.codea.restaurant;

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
        ExecutorService exec = Executors.newCachedThreadPool();
        Restaurant restaurant = new Restaurant(exec,5,2);
        exec.execute(restaurant);
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
//            System.out.println("Press 'Enter' to stop");
//            System.in.read();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        exec.shutdownNow();

    }
}
