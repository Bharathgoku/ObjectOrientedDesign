package ObjectOrientedDesign.SnakesAndLadder;

public interface GameInterface {

    void addPlayer(Player player);

    Player getWinner();

    void updateBoard(int diceTurn);

}
