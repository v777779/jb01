package ch.ex28.remote;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Intern {
    private int value = 15;
    private String s = "Track";

    void init() {
        final int mvalue = 23;
        final String sm = "Repo";

        class InnerClass {
            void demo() {
                System.out.println(value++ + " "+s+" "+mvalue + " "+sm);
                System.out.println(value++ + " "+s+" "+mvalue + " "+sm);

            }

        }

        InnerClass ir = new InnerClass();

        ir.demo();

    }

}
