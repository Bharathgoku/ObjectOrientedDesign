package ObjectOrientedDesign.SnakesAndLadder;

import java.util.Map;

public class Board {

  Map<Integer, Cell> cellMap;

  Board(Map<Integer, Cell> cellMap){
    this.cellMap = cellMap;
  }

  public Cell getCell(Integer num){
    return cellMap.get(num);
  }

}
