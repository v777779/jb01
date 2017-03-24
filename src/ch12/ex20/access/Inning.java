package ch12.ex20.access;

import ch12.ex20.local.BaseBallEx;
import ch12.ex20.local.Foul;
import ch12.ex20.local.Strike;

/**
 * Created by V1 on 03-Mar-17.
 */
abstract public class Inning {
    public Inning() throws BaseBallEx, EmpireEx {
    }

    public void event() throws BaseBallEx {
    }

    public void empire() throws EmpireEx {  // new method
        throw new EmpireEx();
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {

    }
}
