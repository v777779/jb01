package ch09.ex18.gamer;

/**
 * Created by V1 on 14-Feb-17.
 */
public class CheckersFactory implements GameFactory{  // реализация интерфейса фабрики игры
    @Override
    public Game getGame() {
        return new Checkers();  // выдать экземпляр игры в шашки
    }
}
