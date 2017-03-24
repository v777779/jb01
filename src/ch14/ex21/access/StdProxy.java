package ch14.ex21.access;

/**
 * Created by V1 on 11-Mar-17.
 */
public class StdProxy implements IFace {
    private IFace proxiObject; // ссылка на объект с интерфейсом IFace

    public StdProxy(IFace proxiObject) {
        this.proxiObject = proxiObject;
    }

    @Override
    public void doSome() {
        System.out.print("StdProxy.doSome > ");  // функции Proxy
        long start = System.nanoTime();
        proxiObject.doSome();                      // функции Real за Proxy
        System.out.println("time:"+(System.nanoTime()-start));
    }



    @Override
    public void someElse(String s) {
        System.out.print("StdProxy.someElse."+s+" > ");  // функции Proxy
        long start = System.nanoTime();
        proxiObject.someElse(s);                        // функции Real за Proxy
        System.out.println("time:"+(System.nanoTime()-start));
    }
}
