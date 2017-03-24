package ch07.ex11;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Rules {

    String showRules(int number) {
        if (number > 0) {
            return "Game Rules";
        }
        else{
            return "Game Restrictions";
        }
    }
}
