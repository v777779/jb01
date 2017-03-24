package ch14.ex24.include;

import java.util.List;

/**
 * Created by V1 on 12-Mar-17.
 */
public interface Robot {
    String name();
    String model();
    List<Operate> operate();            // встроенный в объект список операций

    class  Test {                        // встроенный класс тестирования робота static по умолчанию
        public static void test(Robot r) {
            if (r instanceof Null) {  // INull это interface
                System.out.println("[NULL Robot]");
            }
            System.out.println("Robot name :"+r.name());
            System.out.println("Robot model:"+r.model());
            for (Operate operate : r.operate()) {
                System.out.println(operate.descr());    // описать команду
                operate.command();                      // выполнить команду
            }
        }
    }

}
