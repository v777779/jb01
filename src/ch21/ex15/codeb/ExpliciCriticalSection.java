package ch21.ex15.codeb;


import lib.threads.PairManager;
import lib.threads.CriticalSection;
import lib.utils.Time;

/**
 * Vadim Voronov
 * Created: 02-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ExpliciCriticalSection {
    public static void check() {
        PairManager pman1 = new ExplicitPairManager1();
        PairManager pman2 = new ExplicitPairManager2();
        PairManager.reset();
        Time.sleep(10);
        CriticalSection.testApproaches(pman1, pman2);

    }
}
