package ch12.ex12a.include;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\n  Check\n");
        int count = 0;

        while (true) {
                System.out.println("while.count  :" + count);
            try {
                if (count++ == 0) {
                    throw new ThreeEx();
                }
                System.out.println("try.count    :" + count);
            } catch (ThreeEx e) {  // срабатывает когда есть исключение
                System.out.println("catch.count  :" + count);
            } finally {   // срабатывает когда исключение есть и когда нет
                System.out.println("finally.count:" + count);
                if (count == 2) {
                    break;
                }
            }
        }

        System.out.println("exit: while done");
    }
}
