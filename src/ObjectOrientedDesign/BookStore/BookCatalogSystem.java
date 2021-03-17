package ObjectOrientedDesign.BookStore;

import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class BookCatalogSystem {

  List<Book> bookList;

  Map<String, Book> isbnBookMap;

  PriorityQueue<Book> pq;

  BookCatalogSystem(){
    this.pq = new PriorityQueue<>((a, b) -> b.getSoldCount() - a.getSoldCount());
  }

  public void addBook(String isbn, String title, String author, Double price){
    // add it to the pq, list and map;
  }

  public List<Book> searchBookByName(String name){
      return  null;
  }

  public List<Book> searchBookByTitle(String title){
      return null;
  }

  public List<Book> searchBookByAuthor(String author){
      return null;
  }

  public Double buy(String isbn, Double amount){
    // check the count and return the status
    Book book = isbnBookMap.get(isbn);
    if(book == null){
      // not book present throw an error or return
    }
    Double remainingAmount = 0.0;
    if(book.getPrice() > amount) {
      // amount is insufficient
    }else if(book.getPrice() < amount){
      // amount is more return the remaining
      remainingAmount = amount - book.getPrice();
    }

    if(book.getCount() == 0){
      // no books available
    }

    book.setCount(book.getCount()-1);
    book.setSoldCount(book.getSoldCount()+1);

    return remainingAmount;

  }

  public List<Book> getTopByAuthorName(String authorName){
    return null;
  }


}
