package ch.ex12a.access;

/**
 * Created by V1 on 13-Feb-17.
 */
public interface Poison extends Insect {
    void sting();
    void attack(); // дублирует метод Fly
}
