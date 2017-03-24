package ch.ex36.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nException w Generic Check\n");
        System.out.println("Processor1<String,Failure1>:");
        ProcessorRunner<String, Failure1> ps = new ProcessorRunner<>();
        for (int i = 0; i < 3; i++) {
            ps.add(new Processor1());  // три объекта Processor1
        }

        try {
            System.out.println(ps.processAll());

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Processor2<Integer,Failure1>:");
        ProcessorRunner<Integer, Failure2> ps2 = new ProcessorRunner<>();
        for (int i = 0; i < 2; i++) {
            ps2.add(new Processor2());  // два объекта Processor2
        }

        try {
            System.out.println(ps2.processAll());

        } catch (Exception e) {
            System.out.println(e);
        }




    }
}
