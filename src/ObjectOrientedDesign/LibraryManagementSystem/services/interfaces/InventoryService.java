package ObjectOrientedDesign.LibraryManagementSystem.services.interfaces;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookItem;
import java.util.List;

public interface InventoryService {

    Book addBook(Book book);

    void addBookItems(List<BookItem> bookItemList);

    // remove just the book item
    void removeBookItem(BookItem bookItem);

    // remove all book items along with book
    void removeBook(Book book);

    List<BookItem> getBookItems(String isbnNumber);

    Book getBook(String isbnNumber);

    BookItem getBookItem(String bookItemId);

}
