package ch07.ex11;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Game {
    Rules rules = new Rules();
    Team team = new Team();
    int ruleNumber = 1;
    int teamNumber = 10;

    String showRules(int i) {
         return rules.showRules(i);  // делегирование метода
    }

    String showTeam(int i) {
        return team.showTeam(i);
    }

    @Override
    public String toString() {
        return "Game: \n"+
                "Rules: "+showRules(ruleNumber)+"\n"+
                super.toString();
    }
}
