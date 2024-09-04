public class League {
    public static void main(String[] args) {
        Team[] theTeams = createTeams();

        Game[] theGames = createGames(theTeams);
        Game currGame = theGames[0];
        currGame.homeTeam = theTeams[0];
        currGame.awayTeam = theTeams[1];

        Goal goal1 = new Goal();
        goal1.player = currGame.homeTeam.playerArray[1];
        goal1.team = currGame.homeTeam;
        goal1.time = 55;

        currGame.goals = new Goal[]{goal1};

        System.out.println(
                "Goals scored after " + currGame.goals[0].time
                + " minutes by " + currGame.goals[0].player.name
                + " of " + currGame.goals[0].team.teamName
        );
    }
    public static Team[] createTeams() {
        Player player1 = new Player();
        player1.name = "Leonard Tucci";
        Player player2 = new Player();
        player2.name = "Michael Brown";
        Player player3 = new Player();
        player3.name = "David Blane";
        Player player4 = new Player();
        player4.name = "Jack Black";
        Player player5 = new Player();
        player5.name = "Donald Remmington";

        Player[] players = {player1, player2, player3, player4, player5};

        Team team1 = new Team();
        team1.teamName = "Green Hellcats";
        team1.playerArray  = players;

        Team team2 = new Team();
        team2.teamName = "Black Hawks";
        team2.playerArray = new Player[5];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].name = "Robert Smith";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].name = "David Jackson";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].name = "Jack Roland";
        team2.playerArray[3] = new Player();
        team2.playerArray[3].name = "Jeremy Schrute";
        team2.playerArray[4] = new Player();
        team2.playerArray[4].name = "Holland Burch";

        return new Team[]{team1, team2};
    }

    public static Game[] createGames(Team[] teams) {
        Game currGame = new Game();
        currGame.homeTeam = teams[0];
        currGame.awayTeam = teams[1];
        return new Game[]{currGame};
    }
}
