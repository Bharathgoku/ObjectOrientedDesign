package ObjectOrientedDesign.LibraryManagementSystem.entities;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.enums.BookItemStatus;
import java.time.LocalDate;


public class BookItem extends Book {

    private BookItemStatus bookItemStatus;
    private String bookItemId;
    private LocalDate checkedOutDate;

    public String getBookItemBarCode() {
        return bookItemId;
    }

    public BookItemStatus getBookItemStatus() {
        return bookItemStatus;
    }
}
