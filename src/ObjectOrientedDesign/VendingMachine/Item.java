package ObjectOrientedDesign.VendingMachine;

public enum Item {
  A("A", 10),B("B", 20),C("C", 30);

  private String name;
  private Integer price;

  Item(String name, Integer price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public Integer getPrice() {
    return price;
  }
}
