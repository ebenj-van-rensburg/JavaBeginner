package soccer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private GameEvent[] goals;
    private LocalDateTime dateTime;


    public void playGame() {
        ArrayList <GameEvent> eventList = new ArrayList();
        GameEvent currEvent;
        for (int i = 1; i <=90; i++){

            if (Math.random() > 0.95){
                currEvent = Math.random() > 0.6?new Goal():new Possession();
                currEvent.setTheTeam(Math.random() > 0.3?homeTeam: awayTeam);
                currEvent.setThePlayer(currEvent.getTheTeam().
                        getPlayerArray()[(int)(Math.random() * currEvent.getTheTeam().getPlayerArray().length)]);
                currEvent.setTheTime(i);
                eventList.add(currEvent);
                //System.out.println(i);
            }
            this.goals = new GameEvent[eventList.size()];
            eventList.toArray(goals);
        }
    }

    public String getDescription() {
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;
        StringBuilder returnString = new StringBuilder();
        returnString.append(homeTeam.getTeamName() + " vs " + awayTeam.getTeamName() + "\n"
            + "Date: " + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE) + "\n");
        for (GameEvent goal : this.getGoals()) {
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

    public GameEvent[] getGoals() {
        return goals;
    }

    public void setGoals(GameEvent[] goals) {
        this.goals = goals;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
