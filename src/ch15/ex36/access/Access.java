package ch.ex36.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 36 Exception w Generic Check\n");

        System.out.println("Processor1<String,Failure1, Failure12>:");
        ProcessorRunner<String, Failure1,Failure12> ps = new ProcessorRunner<>();
        for (int i = 0; i < 3; i++) {
            ps.add(new Processor1());  // три объекта Processor1
        }

        try {
            System.out.println(ps.processAll());

        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(ps.processAll());
          } catch (Exception e) {
            System.out.println("catch: "+e.toString().replaceAll("\\w+\\.",""));
        }
        try {
            Processor1.flagEvent = true;
            System.out.println(ps.processAll());
        } catch (Exception e) {
            System.out.println("catch: "+e.toString().replaceAll("\\w+\\.",""));
        }


        System.out.println("Processor2<Integer,Failure2,Failure22>:");
        ProcessorRunner<Integer, Failure2,Failure22> ps2 = new ProcessorRunner<>();
        for (int i = 0; i < 2; i++) {
            ps2.add(new Processor2());  // два объекта Processor2
        }

        try {
            System.out.println(ps2.processAll());

        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(ps2.processAll());
        } catch (Exception e) {
            System.out.println("catch: "+e.toString().replaceAll("\\w+\\.",""));
        }
        try {
            Processor2.flagEvent = true;
            System.out.println(ps2.processAll());
        } catch (Exception e) {
            System.out.println("catch: "+e.toString().replaceAll("\\w+\\.",""));
        }


    }
}
