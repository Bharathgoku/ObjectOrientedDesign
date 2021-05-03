package ObjectOrientedDesign.SnakesAndLadder;

public class Cell {

  private int number;
  private boolean hasSnake;

  private boolean hasLadder;

  private Cell nextCell;

  public Cell(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public boolean hasSnake() {
    return hasSnake;
  }

  public boolean hasLadder() {
    return hasLadder;
  }

  public Cell getNextCell() {
    return nextCell;
  }
}
