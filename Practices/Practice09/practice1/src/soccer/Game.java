package soccer;

import utility.GameUtils;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;

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
            returnString.append("Goal scored after " + goal.getTheTime() + " minutes by "
                    + goal.getThePlayer().getName() + " of " + goal.getTheTeam().getTeamName() + "\n");
        }
        return returnString.toString();
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Goal[] getGoals() {
        return goals;
    }

    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }
}
