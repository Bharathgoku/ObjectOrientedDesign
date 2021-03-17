package ObjectOrientedDesign.SnakesAndLadder;

public class Player {


  static int inc = 0;

  Integer id;

  String name;

  int cellNum = 0;

  Player(String name){
    this.name = name;
    this.id = inc++;
  }

  public boolean isWinner(){
    if(cellNum == 100)
      return true;
    return false;
  }


}
