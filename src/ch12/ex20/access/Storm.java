package ch12.ex20.access;

import ch12.ex20.local.RainedOut;
import ch12.ex20.local.RiseEmpireEx;

/**
 * Created by V1 on 03-Mar-17.
 */
public interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
    public  void riseEm() throws RiseEmpireEx;
}
