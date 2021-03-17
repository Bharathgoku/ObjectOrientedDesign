package ObjectOrientedDesign.LibraryManagementSystem.services;

import ObjectOrientedDesign.LibraryManagementSystem.DataStore.BookingData;
import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookCheckout;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookItem;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookReservation;
import ObjectOrientedDesign.LibraryManagementSystem.entities.Member;
import ObjectOrientedDesign.LibraryManagementSystem.enums.LendingStatus;
import ObjectOrientedDesign.LibraryManagementSystem.enums.ReservationStatus;
import ObjectOrientedDesign.LibraryManagementSystem.services.interfaces.BookingService;
import ObjectOrientedDesign.LibraryManagementSystem.services.interfaces.InventoryService;
import java.time.LocalDateTime;
import java.util.List;

public class BookingServiceImpl implements BookingService {

    private InventoryService inventoryService;

    private BookingData bookingData;

    @Override
    public BookReservation reserveABookItem(BookItem bookItem, Member member) {
        BookReservation bookReservation = new BookReservation(member, bookItem, LocalDateTime.now(),
            ReservationStatus.RESERVED);

        bookingData.addReservation(bookReservation);

        return bookReservation;
    }

    @Override
    public BookCheckout checkOutBookItem(BookItem bookItem, Member member) {
        BookCheckout bookCheckout = new BookCheckout(bookItem, LocalDateTime.now(), member, LendingStatus.LENT);
        bookingData.addBookCheckout(bookCheckout);
        return bookCheckout;
    }

    @Override
    public void unReserveABook(BookItem bookItem) {
        BookReservation bookReservation = bookingData.getReservationByBookItem(bookItem);
        bookReservation.setReservationStatus(ReservationStatus.COMPLETED);
    }

    @Override
    public BookCheckout checkInBookItem(BookItem bookItem) {

        BookCheckout bookCheckout = bookingData.getBookCheckoutByBookItem(bookItem);
        bookCheckout.setLendingStatus(LendingStatus.RETURNED);
        return bookCheckout;

    }

    @Override
    public List<BookItem> checkOutBooks(Member member) {
        return null;
    }

    @Override
    public List<BookItem> reservedBooks(Member member) {
        return null;
    }

    @Override
    public Member getMember(BookItem bookItem) {
        return null;
    }
}
