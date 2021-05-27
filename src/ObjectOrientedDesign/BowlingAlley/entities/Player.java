package ObjectOrientedDesign.BowlingAlley.entities;

public class Player {

    private String playerName;
    private Integer score;
    private Integer playerSet;
    private Integer playerTry;
    private Set[] setArray;

    public Player(String playerName, Integer setSize) {
        this.playerName = playerName;
        this.setArray = new Set[setSize];
    }

    public Integer getScore() {
        return score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Integer getPlayerSet() {
        return playerSet;
    }

    public Integer getPlayerTry() {
        return playerTry;
    }

    public Set getSet(Integer id){
        return setArray[id];
    }

    public void setPlayerSet(Integer playerSet) {
        this.playerSet = playerSet;
    }

    public void setPlayerTry(Integer playerTry) {
        this.playerTry = playerTry;
    }
}
