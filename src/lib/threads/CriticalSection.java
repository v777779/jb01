package lib.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 02-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CriticalSection {
    public static void testApproaches(PairManager pman1, PairManager pman2) {
        ExecutorService exec = Executors.newCachedThreadPool();
        PairManipulator pm1 = new PairManipulator(pman1);
        PairManipulator pm2 = new PairManipulator(pman2); // все зависит от того, поместили или нет в секцию store

        PairChecker pc1 = new PairChecker(pman1);
        PairChecker pc2 = new PairChecker(pman2);

        exec.execute(pm1);
        exec.execute(pm2);
        exec.execute(pc1);
        exec.execute(pc2);
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println("pm1: " + pm1);
        System.out.println("pm2: " + pm2);

        PairManager.set(); // запрос на вылет

        exec.shutdown();
//        System.exit(0); // принудительный вылет
    }

}
