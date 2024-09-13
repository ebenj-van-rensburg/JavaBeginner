package soccer;

import java.util.ArrayList;
import java.util.StringTokenizer;
import utility.PlayerDatabase;

public class League {
    public static void main(String[] args) {
        League theLeague = new League();

        Team[] theTeams = theLeague.createTeams("Green Hellcats,Black Hawks", 5);

        Game[] theGames = theLeague.createGames(theTeams);

        for (Game currGame : theGames) {
            currGame.playGame();
            System.out.println(currGame.getDescription());
        }
        theLeague.showBestTeam(theTeams);
    }
    public Team[] createTeams(String teamNames, int teamSize) {
        PlayerDatabase playerDB = new PlayerDatabase();
        StringTokenizer teamNameTokens = new StringTokenizer(teamNames, ",");
        Team[] theTeams = new Team[teamNameTokens.countTokens()];
        for (int i =0; i < theTeams.length; i++){
            theTeams[i] = new Team(teamNameTokens.nextToken(), playerDB.getTeam(teamSize));
        }
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        ArrayList<Game> theGames = new ArrayList();

        for (Team homeTeam: theTeams){
            for (Team awayTeam: theTeams){
                if (homeTeam != awayTeam) {
                    theGames.add(new Game(homeTeam, awayTeam));
                }

            }
        }
        return theGames.toArray(new Game[1]);
    }

    public void showBestTeam(Team[] theTeams) {
        Team currBestTeam = theTeams[0];
        System.out.println("\nTeam Points:");
        for (Team currTeam : theTeams) {
            System.out.println(currTeam.getTeamName() + ":" + currTeam.getLeaguePoints()+":"+currTeam.getGoalPoints());
            currBestTeam = currTeam.getLeaguePoints() > currBestTeam.getLeaguePoints() ? currTeam : currBestTeam;
            if (currTeam.getLeaguePoints() > currBestTeam.getLeaguePoints()){
                currBestTeam = currTeam;
            } else if (currTeam.getLeaguePoints() == currBestTeam.getLeaguePoints()){
                if (currTeam.getGoalPoints() > currBestTeam.getGoalPoints()){
                    currBestTeam = currTeam;
                }
            }
        }
        System.out.println("\nBest Team: " + currBestTeam.getTeamName());
    }
}
