package soccer;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import utility.PlayerDatabase;
import utility.PlayerDatabaseException;

public class League {
    public static void main(String[] args) throws PlayerDatabaseException {
        League theLeague = new League();
        try {
            Team[] theTeams = theLeague.createTeams("Green Hellcats,Black Hawks,MDRN Mayhem,Whackin Wallabys", 11);

            Game[] theGames = theLeague.createGames(theTeams);

            System.out.println(theLeague.getLeagueAnnouncement(theGames));

            for (Game currGame : theGames) {
                currGame.playGame();
//            break;
                System.out.println(currGame.getDescription());
            }
            theLeague.showBestTeam(theTeams);
            theLeague.showBestPlayers(theTeams);
        } catch (PlayerDatabaseException e) {
            e.printStackTrace(System.err);
        }
    }
    public Team[] createTeams(String teamNames, int teamSize) throws PlayerDatabaseException {
        PlayerDatabase playerDB = new PlayerDatabase();
        StringTokenizer teamNameTokens = new StringTokenizer(teamNames, ",");
        Team[] theTeams = new Team[teamNameTokens.countTokens()];
        for (int i =0; i < theTeams.length; i++){
            theTeams[i] = new Team(teamNameTokens.nextToken(), playerDB.getTeam(teamSize));
        }
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        int daysBetweenGame = 0;
        ArrayList<Game> theGames = new ArrayList();

        for (Team homeTeam: theTeams){
            for (Team awayTeam: theTeams){
                if (homeTeam != awayTeam) {
                    daysBetweenGame += 4;
                    theGames.add(new Game(homeTeam, awayTeam, LocalDateTime.now().plusDays(daysBetweenGame)));
                }

            }
        }
        return theGames.toArray(new Game[1]);
    }

    public void showBestTeam(Team[] theTeams) {
        Arrays.sort(theTeams);
        Team currBestTeam = theTeams[0];
        System.out.println("\nTeam Points:");
        for (Team currTeam : theTeams) {
            System.out.println(currTeam.getTeamName() + ":" + currTeam.getLeaguePoints()+":"+currTeam.getGoalPoints());
            currBestTeam = currTeam.getLeaguePoints() > currBestTeam.getLeaguePoints() ? currTeam : currBestTeam;
            }
        System.out.println("\nBest Team: " + currBestTeam.getTeamName());
    }

    public String getLeagueAnnouncement(Game[] theGames){
        Period thePeriod = Period.between(theGames[0].getDateTime().toLocalDate(),
                theGames[theGames.length - 1].getDateTime().toLocalDate());

        return "The league is scheduled to run for " +
                thePeriod.getMonths() + " month(s), and " +
                thePeriod.getDays() + " day(s)\n";
    }

    public void showBestPlayers(Team[] theTeams){
        ArrayList<Player> thePlayers = new ArrayList();
        for (Team currTeam: theTeams){
            thePlayers.addAll(Arrays.asList(currTeam.getPlayerArray()));
        }

        Collections.sort(thePlayers, (p1, p2) -> Double.valueOf(p2.getPlayerGoals()).compareTo(Double.valueOf(p1.getPlayerGoals())));

        System.out.println("\nBest Players");
        for (Player currPlayer: thePlayers){
            if (currPlayer.getPlayerGoals() > 0) {
                System.out.println(currPlayer.getName() + " : " + currPlayer.getPlayerGoals());
            }
        }
        System.out.println("\n\n");
    }
}
