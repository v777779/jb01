package ch21.ex39.codee;


import lib.threads.Tester;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MapComparisons {
    static Runtime runtime = Runtime.getRuntime();
    static long memory;

    public static void getMemory() {
        memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.printf("Used memory(MB): %5.3f\n", (double) memory / 1048576);
    }

    public static void check(String[] args) {
        Tester.initMain(args);
        System.out.println("Warm Up:");
        new SynchronizedHashMapTest(10, 0);
        new ConcurrentHashMapTest(10, 0);
        new SynchronizedHashMapTest(10, 0);
        new ConcurrentHashMapTest(10, 0);

        Tester.initMain(new String[]{"1", "1000", "1000"});
        System.out.println("\nStart Tests:");

        new SynchronizedHashMapTest(10, 0);
        new SynchronizedHashMapTest(9, 1);
        new SynchronizedHashMapTest(5, 5);
        new ConcurrentHashMapTest(10, 0);
        new ConcurrentHashMapTest(9, 1);
        new ConcurrentHashMapTest(5, 5);

//memory
        System.out.println("\nTests:");
        getMemory();
//runtime
        long start = System.nanoTime();
        new ConcurrentHashMapTest(5, 5);
        System.out.printf("Runtime(ms): %.3f",(double)(System.nanoTime()-start)/1e6);

        Tester.exec.shutdown();


    }


}
