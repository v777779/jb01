package ch12.ex21.integra;

/**
 * Created by V1 on 03-Mar-17.
 */
public class NeedsCleanup2 extends NeedsCleanup {
    @Override
    public String toString() {
        return "NeedsCleanup2." +
                getCounter();
    }

    public NeedsCleanup2() throws  ConstructException{

    }
}
