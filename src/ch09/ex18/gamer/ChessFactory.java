package ch.ex18.gamer;

/**
 * Created by V1 on 14-Feb-17.
 */
public class ChessFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Chess();  // выдать шахматы
    }
}
