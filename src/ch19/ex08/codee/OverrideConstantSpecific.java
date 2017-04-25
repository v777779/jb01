package ch19.ex08.codee;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public enum OverrideConstantSpecific {
    NUT, BOLT,
    WASHER {
        void f() {
            System.out.println("Overriden method");
        }
    };

    void f() {
        System.out.println("Default method");
    }

    public static void check() {
        for (OverrideConstantSpecific ocs : OverrideConstantSpecific.values()) {
            System.out.print(ocs.name() + " : ");
            ocs.f();
        }
    }
}
