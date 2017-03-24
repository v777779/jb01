package ch10.ex17.game;

/**
 * Created by V1 on 14-Feb-17.
 */
public interface IPlayer {
    void setMove();
    String getMove();
    int getScore();
    void setScore();
    void showStatus();
}
