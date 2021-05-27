package ObjectOrientedDesign.DeckOfCards.Poker;

public interface PlayerInterface {

    void raise(Integer amount, Integer playerId);

    void call(Integer playerId);

    void fold(Integer playerId);

    void removeFromTable(Integer tableId, Integer playerId);

}
