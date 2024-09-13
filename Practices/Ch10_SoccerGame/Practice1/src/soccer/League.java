package soccer;

public class League {
    public static void main(String[] args) {
        League theLeague = new League();

        Team[] theTeams = theLeague.createTeams();

        Game[] theGames = theLeague.createGames(theTeams);

        for (Game currGame : theGames) {
            currGame.playGame();
            System.out.println(currGame.getDescription());
        }
        theLeague.showBestTeam(theTeams);
    }
    public Team[] createTeams() {
        Player player1 = new Player("Leonard Tucci");
//        player1.setName();
        Player player2 = new Player("Michael Brown");
        Player player3 = new Player("David Blane");
        Player player4 = new Player("Jack Black");
        Player player5 = new Player("Donald Remmington");

        Player[] players = {player1, player2, player3, player4, player5};

        Team team1 = new Team("Green Hellcats", players);

        Team team2 = new Team();
        team2.setTeamName("Black Hawks");
        team2.setPlayerArray(new Player[5]);
        team2.getPlayerArray()[0] = new Player();
        team2.getPlayerArray()[0].setName("Robert Smith");
        team2.getPlayerArray()[1] = new Player();
        team2.getPlayerArray()[1].setName("David Jackson");
        team2.getPlayerArray()[2] = new Player();
        team2.getPlayerArray()[2].setName("Jack Roland");
        team2.getPlayerArray()[3] = new Player();
        team2.getPlayerArray()[3].setName("Jeremy Schrute");
        team2.getPlayerArray()[4] = new Player();
        team2.getPlayerArray()[4].setName("Holland Burch");

        return new Team[]{team1, team2};
    }

    public Game[] createGames(Team[] teams) {
        Game currGame = new Game(teams[0], teams[1]);
        Game currGame2 = new Game(teams[1], teams[0]);
        Game currGame3 = new Game(teams[0], teams[1]);
        Game currGame4 = new Game(teams[1], teams[0]);
        Game[] games = {currGame, currGame2, currGame3, currGame4};
        return games;
    }

    public void showBestTeam(Team[] theTeams) {
        Team currBestTeam = theTeams[0];
        System.out.println("\nTeam Points:");
        for (Team currTeam : theTeams) {
            System.out.println(currTeam.getTeamName() + ":" + currTeam.getLeaguePoints());
            currBestTeam = currTeam.getLeaguePoints() > currBestTeam.getLeaguePoints() ? currTeam : currBestTeam;
        }
        System.out.println("\nBest Team: " + currBestTeam.getTeamName());
    }
}
