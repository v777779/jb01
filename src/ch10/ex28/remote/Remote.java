package ch10.ex28.remote;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Remote {
    public static void app() {
        Intern intern = new Intern();
        intern.init();
        System.out.println("\n Interface Implementation \n");
        LocalClass lc = new LocalClass();
        ICounter c1 = lc.getCountInner("InnerCounter");
        ICounter c2 = lc.getCountAnonim("AnonimCounter");
        c1.next();
        c2.next();
        c1.next();
        c2.next();
    }
}
