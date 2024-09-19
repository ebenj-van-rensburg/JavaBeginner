package soccer;

public class Team implements Comparable {
    private String teamName;
    private Player[] playerArray;
    private int leaguePoints;
    private int goalPoints;

    public int compareTo(Object theTeam){
        int returnValue = -1;
        if (this.getLeaguePoints()< ((Team)theTeam).getLeaguePoints()) {
            returnValue = 1;
        } else if (this.getLeaguePoints() == ((Team)theTeam).getLeaguePoints()){
            if (this.getGoalPoints()< ((Team)theTeam).getGoalPoints()) {
                returnValue = 1;
            }
        }
        return returnValue;
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, Player[] playerArray) {
        this(teamName);
        this.playerArray = playerArray;
    }

    public Team() {
    }

    public void incLeaguePoints() {
        this.leaguePoints++;
    }

    public void incGoalPoints() {
        this.goalPoints++;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayerArray() {
        return playerArray;
    }

    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(int leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public int getGoalPoints() {
        return goalPoints;
    }

    public void setGoalPoints(int goalPoints) {
        this.goalPoints = goalPoints;
    }
}
