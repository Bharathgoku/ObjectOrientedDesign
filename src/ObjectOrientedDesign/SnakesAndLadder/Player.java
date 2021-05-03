package ObjectOrientedDesign.SnakesAndLadder;

public class Player {

    private String name;

    private int cellNum = 0;

    Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCellNum() {
        return cellNum;
    }

    public void setCellNum(int cellNum) {
        this.cellNum = cellNum;
    }


}
