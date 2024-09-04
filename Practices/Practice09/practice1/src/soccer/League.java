package soccer;

public class League {
    public static void main(String[] args) {
        League theLeague = new League();

        Team[] theTeams = theLeague.createTeams();

        Game[] theGames = theLeague.createGames(theTeams);
        Game currGame = theGames[0];
        currGame.setHomeTeam(theTeams[0]);
        currGame.setAwayTeam(theTeams[1]);

        currGame.playGame();
        System.out.println(currGame.getDescription());

    }
    public Team[] createTeams() {
        Player player1 = new Player();
        player1.setName("Leonard Tucci");
        Player player2 = new Player();
        player2.setName("Michael Brown");
        Player player3 = new Player();
        player3.setName("David Blane");
        Player player4 = new Player();
        player4.setName("Jack Black");
        Player player5 = new Player();
        player5.setName("Donald Remmington");

        Player[] players = {player1, player2, player3, player4, player5};

        Team team1 = new Team();
        team1.setTeamName("Green Hellcats");
        team1.setPlayerArray(players);

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
        Game currGame = new Game();
        currGame.setHomeTeam(teams[0]);
        currGame.setAwayTeam(teams[1]);
        return new Game[]{currGame};
    }
}
