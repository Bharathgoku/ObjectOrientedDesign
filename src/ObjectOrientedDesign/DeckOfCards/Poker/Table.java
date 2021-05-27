package ObjectOrientedDesign.DeckOfCards.Poker;

import java.util.List;
import java.util.Set;

public class Table {

    private Integer tableId;

    private List<Round> roundList;

    private Set<Integer> playerList;

    private Round currentRound;

    public Round getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(Round currentRound) {
        this.currentRound = currentRound;
    }

    public void addPlayer(Integer id){
        playerList.add(id);
    }

    public void removePlayer(Integer id){
        // remove the player
    }
}
