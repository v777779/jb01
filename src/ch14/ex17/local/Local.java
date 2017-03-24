package ch14.ex17.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    static void test(Object x) {
        System.out.println("Test  x type                      :"+x.getClass());
        System.out.println("x instanceOf Base                 :"+(x instanceof Base));
        System.out.println("x instanceOf Derived              :"+(x instanceof Derived));
        System.out.println("Base.isInstance(x)                :"+Base.class.isInstance(x));
        System.out.println("Derived.isInstance(x)             :"+Derived.class.isInstance(x));
        System.out.println("x.getClass()==Base.class          :"+(x.getClass() == Base.class));
        System.out.println("x.getClass()==Derived.class       :"+(x.getClass() == Derived.class));
        System.out.println("x.getClass().equals(Base.class)   :"+x.getClass().equals(Base.class));
        System.out.println("x.getClass().equals(Derived.class):"+x.getClass().equals(Derived.class));

    }
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nInstanceOf  Check\n");
        System.out.println("Test Base class object:");
        test(new Base());
        System.out.println("\nTest Derived class object:");
        test(new Derived());

        System.out.println("\nTest Base  t = new Derived() class object:");
        Base t = new Derived();
        test(t);




    }
}
