package ch17.ex12.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nDeque Check\n");
        CDeque<Integer> dq = new CDeque<>();
        CDeque.fill(dq);
        System.out.println(dq);
        while (dq.size() > 0) {
            System.out.print(dq.removeFirst()+" ");
        }
        System.out.println();
        CDeque.fill(dq);
        while (dq.size() > 0) {
            System.out.print(dq.removeLast()+" ");
        }
        System.out.println();


    }
}
