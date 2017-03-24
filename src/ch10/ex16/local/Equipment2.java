package ch10.ex16.local;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Equipment2 implements IService {
    @Override
    public void method1() {
        System.out.println("Equipment2.method1");
    }
    @Override
    public void method2() {
        System.out.println("Equipment2.method2");
    }

    public static IFactory factory = new IFactory() {  // анонимный  класс
        @Override
        public IService getService() {
            return new Equipment2();
        }
    };

    public static IService getService() {  // статический метод
            return new Equipment2();
        }

}
