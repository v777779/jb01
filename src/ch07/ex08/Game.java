package ch07.ex08;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Game {
    int i;

    public Game(int i) {
        this.i = i;
        System.out.println("Game Constructor non Deafult");
    }

    @Override
    public String toString() {
        return ("Game int i = " + i + " " );
    }
}
