package ObjectOrientedDesign.LibraryManagementSystem;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookItem;

public interface MemberSystem extends SearchService {

    // 2. checkout a book
    BookItem checkoutBookItem(BookItem bookItem);
    // 3. reserve a book
    Book reserveABook(Book book);

    // 4. return a book
    void returnBookItem(BookItem bookItem);

    BookItem renewBookItem(BookItem bookItem);


}
