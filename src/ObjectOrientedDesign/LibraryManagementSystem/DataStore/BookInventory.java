package ObjectOrientedDesign.LibraryManagementSystem.DataStore;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookInventory {

  Map<String, Book> bookMap;

  Map<String, BookItem> bookItemMap;

  Map<String, List<String>> bookItemListMap;

  public Book addBook(Book book){
    bookMap.put(book.getIsbn(), book);
    return book;
  }

  public BookItem addBookItem(BookItem bookItem){
    bookItemMap.put(bookItem.getBookItemBarCode(), bookItem);
    List<String> bookItemList = bookItemListMap.getOrDefault(bookItem.getIsbn(), new ArrayList<>());
    bookItemList.add(bookItem.getBookItemBarCode());
    bookItemListMap.put(bookItem.getIsbn(), bookItemList);
    return bookItem;
  }

}
