package soccer;

public class Player {
    private String name;
    private int playerGoals;

    public Player(String name) {
        this.name = name;
    }

    public Player() {}

    public void incPlayerGoals() {
        this.playerGoals++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerGoals() {
        return playerGoals;
    }
}
