package ch10.ex25.local;

/**
 * Created by V1 on 17-Feb-17.
 */
public class CallOne implements Incrementable{  // standard class
    private int value = 0;
    @Override
    public void increment() {
        value++;
        System.out.print("CallOne.increment."+value+" > ");
    }
}
