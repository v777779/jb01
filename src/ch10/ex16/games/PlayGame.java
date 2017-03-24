package ch.ex16.games;

/**
 * Created by V1 on 14-Feb-17.
 */
public class PlayGame {                                     // статический метод играть в игру
    public static void playGame(IGameFactory gameFactory) {
        IGame game = gameFactory.getGame();                  // получить игру из  интерфейса игр
        while (game.move()) {
        }
    }
    public static void playGame(IGame game) {   // тоже самое но без фабрики игры
        while (game.move()) {
        }
    }

}
