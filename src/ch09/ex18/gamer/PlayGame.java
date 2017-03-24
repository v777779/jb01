package ch09.ex18.gamer;

/**
 * Created by V1 on 14-Feb-17.
 */
public class PlayGame {                                     // статический метод играть в игру
    public static void playGame(GameFactory gameFactory) {
        Game game = gameFactory.getGame();                  // получить игру из  интерфейса игр
        while (game.move()) {
        }
    }
    public static void playGame(Game game) {   // тоже самое но без фабрики игры
        while (game.move()) {
        }
    }

}
