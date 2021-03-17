package ObjectOrientedDesign.VendingMachine;

public enum Denomination {


  ONE(1),TWO(2),FIVE(5),TEN(10);

  private int value;

  Denomination(int value) {
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }

}
