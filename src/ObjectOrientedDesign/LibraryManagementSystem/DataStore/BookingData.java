package ObjectOrientedDesign.LibraryManagementSystem.DataStore;

import ObjectOrientedDesign.BookStore.Book;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookCheckout;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookItem;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookReservation;
import ObjectOrientedDesign.LibraryManagementSystem.entities.Member;
import ObjectOrientedDesign.LibraryManagementSystem.enums.ReservationStatus;
import java.util.List;

public class BookingData {

    private List<BookReservation> bookReservationList;
    private List<BookCheckout> bookCheckoutList;

    public List<Book> getReservedBookById(String memberId){
        return null;
    }

    public List<BookItem> getCheckedOutBooksById(String memberId){
        return null;
    }

    public BookReservation addReservation(BookReservation bookReservation){
        bookReservationList.add(bookReservation);
        return bookReservation;
    }

    public BookCheckout addBookCheckout(BookCheckout bookCheckout){
        bookCheckoutList.add(bookCheckout);
        return bookCheckout;
    }

    public BookReservation getReservationByBookItem(BookItem bookItem){
        for(BookReservation bookReservation : bookReservationList){
            if(bookReservation.getBookItem() == bookItem && bookReservation.getReservationStatus() == ReservationStatus.RESERVED)
                return bookReservation;
        }

        return null;
    }

    public BookCheckout getBookCheckoutByBookItem(BookItem bookItem){
        for(BookCheckout bookCheckout : bookCheckoutList){
            if(bookCheckout.getBookItem().equals(bookItem)){
                return bookCheckout;
            }
        }
        return null;
    }

}
