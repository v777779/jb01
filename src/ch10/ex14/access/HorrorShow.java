package ch.ex14.access;

/**
 * Created by V1 on 15-Feb-17.
 */
public class HorrorShow {
    public static void u(IMonster b) {
        b.menace();  // basic function
    }

    public static void v(IDangerousMonster d) {
        d.destroy(); // extended function
    }

    public static void w(ILethal l) {
        l.kill(); // advanced function
    }
}
