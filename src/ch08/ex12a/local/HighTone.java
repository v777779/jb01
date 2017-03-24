package ch08.ex12a.local;

/**
 * Created by V1 on 10-Feb-17.
 */
public class HighTone extends Singer {
    public HighTone() {
        System.out.println("HighTone.HighTone");
    }
    protected void dispose() {
        System.out.println("HighTone.dispose");
        super.dispose();
    }

    @Override
    protected void addRef() {

    }
}
