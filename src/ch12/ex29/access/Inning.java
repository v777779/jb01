package ch12.ex29.access;

import java.util.Random;

/**
 * Created by V1 on 03-Mar-17.
 */
abstract public class Inning {
    public Inning() throws BaseBallEx {
        if(new Random().nextBoolean()) {
           throw new BaseBallEx();
        }
    }

    public void event() throws BaseBallEx {
        if(new Random().nextBoolean())
         throw new BaseBallEx("Message:Inning.event()");

    }

    public abstract void atBat() throws Strike, Foul;
    public void walk() {

    }
}
