package ch07.ex06;

/**
 * Created by V1 on 08-Feb-17.
 */
public class BoardGame extends Game {
    int i;

    public BoardGame(int i) {
        super(i);
        System.out.println("BoardGame.Constructor");
        this.i = i;
    }
}
