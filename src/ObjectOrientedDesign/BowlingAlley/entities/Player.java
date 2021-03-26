package ObjectOrientedDesign.BowlingAlley.entities;

public class Player {

    private String playerName;
    private Integer playerSet;
    private Integer playerTry;
    private Set[] setArray;

    public Player(String playerName) {
        this.playerName = playerName;
        this.setArray = new Set[10];
    }
}
