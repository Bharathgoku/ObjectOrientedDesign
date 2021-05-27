package ObjectOrientedDesign.DeckOfCards.Poker;

import java.util.List;

public class Player {

    private Integer playerId;
    private Round round;
    private String name;
    private Integer playerAmount;
    private Status status;
    private List<Card> cards;
    private Integer betAmount;

    public Player(String name, Integer amount) {
        this.name = name;
        this.playerAmount = amount;
    }

    public void raise(Integer raise){

    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
