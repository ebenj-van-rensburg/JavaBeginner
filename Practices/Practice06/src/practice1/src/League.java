public class League {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.name = "Leonard Tucci";
        Player p2 = new Player();
        p2.name = "Michael Brown";
        Player p3 = new Player();
        p3.name = "David Blane";
        Player p4 = new Player();
        p4.name = "Jack Black";
        Player p5 = new Player();
        p5.name = "Donald Remmington";

        Player[] players = {p1, p2, p3, p4, p5};

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

//        p1.name = "Robert Service";
        System.out.println(team1.teamName + ":");
        for (Player thePlayer : team1.playerArray) {
            System.out.println(thePlayer.name);
        }
        System.out.println("\n" + team2.teamName + ":");
        for (Player thePlayer : team2.playerArray) {
            System.out.println(thePlayer.name);
        }
    }
}
