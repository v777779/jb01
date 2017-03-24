package ch08.ex11.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class PrivateOverride {
    public int iField = 12;
    public int kField = 14;

   public static void staticOverrided() {
       System.out.println("PrivateOverride.staticOverrided");
    }

    public static void staticNotOverrided() {
        System.out.println("PrivateOverride.staticNotOverrided");
    }

    private void f() {
        System.out.println("PrivateOverride.f");
    }

    public void getNotOverrided() {
        System.out.println("PrivateOverride.getNotOverrided");
    }
    private void getOverrided() {
        System.out.println("PrivateOverride.getOverrided");
    }

    public int getField() {
        return iField;
    }

    @Override
    public String toString() {
        return "PrivateOverride{" +
                "field=" + iField +
                ", k=" + kField +
                '}';
    }
}
