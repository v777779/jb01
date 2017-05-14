package ch21.ex39.coded;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ListComparisons {
    public static void check(String[] args) {
        Tester.initMain(args);
        System.out.println("Warm Up:");
        new SynchronizedArrayListTest(10,0);
        new CopyOnWriteArrayListTest(10,0);
        new SynchronizedArrayListTest(10,0);
        new CopyOnWriteArrayListTest(10,0);

        Tester.initMain(new String[]{"1","1000","1000"});
        System.out.println("\nStart Tests:");
        new SynchronizedArrayListTest(10,0);
        new SynchronizedArrayListTest(9,1);
        new SynchronizedArrayListTest(5,5);
        new CopyOnWriteArrayListTest(10,0);
        new CopyOnWriteArrayListTest(9,1);
        new CopyOnWriteArrayListTest(5,5);
        Tester.exec.shutdown();

    }
}
