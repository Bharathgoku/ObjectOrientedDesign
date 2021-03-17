package ObjectOrientedDesign.SnakesAndLadder;

import java.util.List;

public class Game {

  List<Player> playerList;

  Board board;

  Player winner;

  Game(Board board){
    this.board = board;
  }

  public void addPlayer(Player player){
    playerList.add(player);
  }

  public Player getWinner(){
    return winner;
  }

  public void startGame(){

    while(winner == null){
      for(Player player: playerList){
        int num = (int) Math.random();
        int currentCellNum = player.cellNum;
        int updatedCellNum = currentCellNum + num;
        if(updatedCellNum > 100)
          continue;

        Cell cell = board.getCell(updatedCellNum);

        if(cell.hasLadder){
          cell = cell.nextCell;
        }else if(cell.hasSnake){
          cell = cell.nextCell;
        }

        player.cellNum = cell.number;

        if(player.isWinner()){
          winner = player;
          break;
        }

      }
    }

  }

}
