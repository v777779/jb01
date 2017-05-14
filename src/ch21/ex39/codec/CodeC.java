package ch21.ex39.codec;

import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 12-May-17.
 */
public class CodeC {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====CODE_C===");
        System.out.println("\n Check\n");
        System.out.println("CopyOnWriteArrayList:");
        CopyOnWriteListTest.check();
        Time.sleep(100);
        System.out.println("\nCopyOnWriteArraySet:");
        CopyOnWriteSetTest.check();
        Time.sleep(100);
        System.out.println("\nConcurrentHashMap:");
        ConcurrentMap.check();
        Time.sleep(100);
        System.out.println("\nConcurrentLinkedQueue:");
        ConcurrentQueue.check();


    }
}
