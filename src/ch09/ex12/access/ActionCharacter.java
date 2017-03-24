package ch09.ex12.access;

/**
 * Created by V1 on 13-Feb-17.
 */
public class ActionCharacter implements CanFight{  // необязательно, но возможно
    public void fight() {
        System.out.println("Hero.fight");
    }
}
