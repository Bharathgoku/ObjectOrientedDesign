package ObjectOrientedDesign.SnakesAndLadder;

import java.util.ArrayList;
import java.util.List;

public class Game implements GameInterface{

    private List<Player> playerList;

    private Board board;

    private Integer currentPlayer;

    private Player winnerPlayer;

    public Game(){
        this.board = new Board();
        this.playerList = new ArrayList<>();
        this.currentPlayer = 0;
        this.winnerPlayer = null;
    }

    public void addPlayer(Player player){
        playerList.add(player);
    }

    public Player getWinner(){
        return winnerPlayer;
    }

    public void updateBoard(int diceTurn){
        Player player = playerList.get(currentPlayer);
        int currentCellNum = player.getCellNum();
        int updatedCellNum = currentCellNum + diceTurn;
        if(updatedCellNum <= board.getBoardSize()){
            Cell cell = board.getCell(updatedCellNum);
            if(cell.hasLadder() || cell.hasSnake()){
                cell = cell.getNextCell();
            }
            player.setCellNum(cell.getNumber());
        }
        if(player.getCellNum() == board.getBoardSize())
            winnerPlayer = player;
        if(diceTurn != 6)
            updateCurrentPlayer();
    }

    private void updateCurrentPlayer(){
        int len = playerList.size();
        currentPlayer++;
        currentPlayer = currentPlayer%len;
    }

}
