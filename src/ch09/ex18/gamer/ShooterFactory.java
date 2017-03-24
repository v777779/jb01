package ch09.ex18.gamer;

/**
 * Created by V1 on 14-Feb-17.
 */
public class ShooterFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Shooter();  // выдать стрелялку
    }
}
