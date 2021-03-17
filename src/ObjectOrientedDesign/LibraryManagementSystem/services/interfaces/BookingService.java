package ObjectOrientedDesign.LibraryManagementSystem.services.interfaces;

import ObjectOrientedDesign.LibraryManagementSystem.entities.BookCheckout;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookReservation;
import ObjectOrientedDesign.LibraryManagementSystem.entities.Member;
import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookItem;
import java.util.List;

public interface BookingService {

    BookReservation reserveABookItem(BookItem bookItem, Member member);

    BookCheckout checkOutBookItem(BookItem bookItem, Member member);

    void unReserveABook(BookItem bookItem);

    BookCheckout checkInBookItem(BookItem bookItem);

    List<BookItem> checkOutBooks(Member member);

    List<BookItem> reservedBooks(Member member);

    Member getMember(BookItem bookItem);

    BookReservation getReservationByBookItem(BookItem bookItem);

    BookCheckout getCheckoutByBookItem(BookItem bookItem);

}
