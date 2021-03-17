package ObjectOrientedDesign.LibraryManagementSystem;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookItem;

public class MemberSystemImpl extends SearchServiceImpl implements MemberSystem{

    @Override
    public BookItem checkoutBookItem(BookItem bookItem) {
        return null;
    }

    @Override
    public Book reserveABook(Book book) {
        return null;
    }

    @Override
    public void returnBookItem(BookItem bookItem) {

    }

    @Override
    public BookItem renewBookItem(BookItem bookItem) {
        return null;
    }

}
