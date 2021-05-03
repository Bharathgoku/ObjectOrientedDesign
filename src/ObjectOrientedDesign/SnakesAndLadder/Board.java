package ObjectOrientedDesign.SnakesAndLadder;

import java.util.List;
import java.util.Map;

public class Board {

  private int boardSize = 10;
  private Cell[][] cells;

  public Board() {
    // initialise board and cells
  }

  public Cell getCell(int num){

    // get cell from num;

    return new Cell(num);
  }

  public int getBoardSize() {
    return boardSize;
  }
}
