package ch12.ex21.integra;

/**
 * Created by V1 on 03-Mar-17.
 */
public class NeedsCleanup {
    private static long counter = 1;
    private final long idCounter = counter++;
    public void dispose() {
        System.out.println(this.toString()+".dispose()");
    }

    protected long getCounter() {
        return idCounter;
    }
    @Override
    public String toString() {
        return "NeedsCleanup." +
                idCounter;
    }
}
