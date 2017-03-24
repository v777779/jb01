package ch08.ex11.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Derived extends PrivateOverride {
    public int iField = 15;

    public void f() {
        System.out.println("Derived.f");
    }

    public static void staticOverrided() {
        System.out.println("Derived.staticOverrided");
    }
    @Override
    public int getField() {
        return iField;
    }

//    @Override
    public void getOverrided() {
        System.out.println("Derived.getOverrided");
    }

    @Override
    public String toString() {
        return "Derived{" +
                "iField=" + iField +
                '}' + " { getField ="+
                +getField()+"}";
    }
}
