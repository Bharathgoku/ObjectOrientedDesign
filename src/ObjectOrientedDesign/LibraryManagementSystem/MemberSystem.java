package ObjectOrientedDesign.LibraryManagementSystem;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookCheckout;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookItem;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookReservation;
import ObjectOrientedDesign.LibraryManagementSystem.entities.Member;

public interface MemberSystem extends SearchService {

    // 2. checkout a book
    BookCheckout checkoutBookItem(BookItem bookItem, Member member);
    // 3. reserve a book
    BookReservation reserveABookItem(BookItem bookItem, Member member);

    // 4. return a book
    void returnBookItem(BookItem bookItem);

    BookCheckout renewBookItem(BookItem bookItem, Member member);


}
