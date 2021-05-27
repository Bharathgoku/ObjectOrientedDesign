package ObjectOrientedDesign.DeckOfCards.Poker;

import java.util.List;

public class Round {

    private List<Player> playerList;

    private Integer currentPlayer;

    private Player winner;

    private Integer currentBetAmount;

    private Integer potAmount;

    private CardDeck cardDeck;

    private List<Card> closedCards;

    private List<Card> openCards;

    // state 1 -- anni close
    // state 2 --

    public void addPlayer(String name, Integer amount){
        Player player = new Player(name, amount);
        playerList.add(player);
    }

    // raise - raise current bet amount, call , fold - dropped from game

    // raise  - amount parameter, player_id

    // call -  player_id

    // fold - player status change

    public void raise(Integer amount, Player player){

    }

    public void call(Player player){

    }

    public void fold(Player player){
        player.setStatus(Status.FOLD);
    }


    private void updatePlayer(){
        int len = playerList.size();
        currentPlayer++;
        currentPlayer = currentPlayer/len;
    }

    public List<Card> getClosedCards() {
        return closedCards;
    }

    public List<Card> getOpenCards() {
        return openCards;
    }
}
