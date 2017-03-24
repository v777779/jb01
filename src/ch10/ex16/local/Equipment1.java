package ch10.ex16.local;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Equipment1 implements IService {
    @Override
    public void method1() {
        System.out.println("Equipment1.method1");
    }
    @Override
    public void method2() {
        System.out.println("Equipment1.method2");
    }

    public static IFactory factory = new IFactory() {
            public IService getService() {
            return new Equipment1();
        }
    };

    public static IService getService() {  // статический метод
        return new Equipment1();
    }



}
