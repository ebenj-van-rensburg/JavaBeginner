package soccer;

import utility.GameUtils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;
    private LocalDateTime dateTime;

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
        returnString.append(homeTeam.getTeamName() + " vs " + awayTeam.getTeamName() + "\n"
            + "Date: " + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE) + "\n");
        for (Goal goal : this.getGoals()) {
            if (goal.getTheTeam() == homeTeam) {
                homeTeamGoals++;
                homeTeam.incGoalPoints();
            } else {
                awayTeamGoals++;
                awayTeam.incGoalPoints();
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

    public Game(Team homeTeam, Team awayTeam, LocalDateTime dateTime) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.dateTime = dateTime;

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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
