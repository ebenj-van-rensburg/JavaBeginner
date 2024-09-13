package soccer;

import utility.GameUtils;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;

    public void playGame(int maxGoals) {
        int goalAmount = (int) (Math.random() * (maxGoals + 1));
        this.setGoals(new Goal[goalAmount]);
        GameUtils.addGameGoals(this);
    }

    public void playGame() {
        playGame(6);
    }

    public String getDescription() {
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;
        StringBuilder returnString = new StringBuilder();
        returnString.append(homeTeam.getTeamName() + " vs " + awayTeam.getTeamName() + "\n");
        for (Goal goal : this.getGoals()) {
            if (goal.getTheTeam() == homeTeam) {
                homeTeamGoals++;
            } else {
                awayTeamGoals++;
            }
            returnString.append("Goal scored after " + goal.getTheTime() + " minutes by "
                    + goal.getThePlayer().getName() + " of " + goal.getTheTeam().getTeamName() + "\n");
        }
        if (homeTeamGoals == awayTeamGoals) {
            returnString.append("You have tied the game.\n");
        } else if (homeTeamGoals > awayTeamGoals) {
            returnString.append(homeTeam.getTeamName() + " won.\n");
            homeTeam.incLeaguePoints();
        } else {
            returnString.append(awayTeam.getTeamName() + " won.\n");
            awayTeam.incLeaguePoints();
        }
        returnString.append("Home team: " + homeTeamGoals + " - Away team: " + awayTeamGoals + "\n");
        return returnString.toString();
    }

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
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
