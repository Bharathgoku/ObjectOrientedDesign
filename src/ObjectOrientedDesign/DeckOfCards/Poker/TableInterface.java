package ObjectOrientedDesign.DeckOfCards.Poker;

import java.util.List;

public interface TableInterface {

    List<Card> getOpenCards(Integer tableId);

    List<Player> getPlayers(Integer tableId);

    void removePlayer(Integer playerId, Integer tableId);

    Round createRound(Integer tableId);

}
