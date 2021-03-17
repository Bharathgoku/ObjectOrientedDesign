package ObjectOrientedDesign.BookStore;

public class Book {

  private String isbnNo;

  private String title;

  private String author;

  private Double price;

  private Integer soldCount;

  private Integer count;


  public Integer getSoldCount() {
    return soldCount;
  }

  public void setSoldCount(Integer soldCount) {
    this.soldCount = soldCount;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Double getPrice() {
    return price;
  }
}
