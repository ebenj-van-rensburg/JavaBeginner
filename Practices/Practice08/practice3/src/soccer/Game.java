package soccer;

import utility.GameUtils;

public class Game {
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;

    public void playGame(int maxGoals) {
        int goalAmount = (int) (Math.random() * (maxGoals + 1));
        this.goals = new Goal[goalAmount];
        GameUtils.addGameGoals(this);
    }

    public void playGame() {
        playGame(6);
    }

    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal goal : this.goals) {
            returnString.append("Goal scored after " + goal.theTime + " minutes by "
                    + goal.thePlayer.name + " of " + goal.theTeam.teamName + "\n");
        }
        return returnString.toString();
    }
}
