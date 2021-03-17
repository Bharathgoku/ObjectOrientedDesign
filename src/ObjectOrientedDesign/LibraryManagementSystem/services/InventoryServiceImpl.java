package ObjectOrientedDesign.LibraryManagementSystem.services;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.DataStore.BookInventory;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookItem;
import ObjectOrientedDesign.LibraryManagementSystem.services.interfaces.InventoryService;
import java.util.List;

public class InventoryServiceImpl implements InventoryService {

    private BookInventory bookInventory;

    @Override
    public Book addBook(Book book) {

        bookInventory.addBook(book);
        return book;
    }

    @Override
    public void addBookItems(List<BookItem> bookItemList) {
        for(BookItem bookItem : bookItemList){
            bookInventory.addBookItem(bookItem);
        }
    }

    @Override
    public void removeBookItem(BookItem bookItem) {

    }

    @Override
    public void removeBook(Book book) {

    }

    @Override
    public List<BookItem> getBookItems(String isbnNumber) {

        return null;
    }

    @Override
    public Book getBook(String isbnNumber) {
        return null;
    }

    @Override
    public BookItem getBookItem(String bookItemId) {
        return null;
    }
}
