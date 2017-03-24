package ch12.ex20.local;

/**
 * Created by V1 on 03-Mar-17.
 */
public interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}
