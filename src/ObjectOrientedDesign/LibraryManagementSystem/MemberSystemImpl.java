package ObjectOrientedDesign.LibraryManagementSystem;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookCheckout;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookItem;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookReservation;
import ObjectOrientedDesign.LibraryManagementSystem.entities.Fine;
import ObjectOrientedDesign.LibraryManagementSystem.entities.Member;
import ObjectOrientedDesign.LibraryManagementSystem.enums.BookItemStatus;
import ObjectOrientedDesign.LibraryManagementSystem.enums.Category;
import ObjectOrientedDesign.LibraryManagementSystem.enums.FineStatus;
import ObjectOrientedDesign.LibraryManagementSystem.enums.ReservationStatus;
import ObjectOrientedDesign.LibraryManagementSystem.exceptions.LibraryException;
import ObjectOrientedDesign.LibraryManagementSystem.services.interfaces.BookingService;
import ObjectOrientedDesign.LibraryManagementSystem.services.interfaces.FineService;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class MemberSystemImpl  implements MemberSystem{

    private BookingService bookingService;
    private FineService fineService;
    private SearchService searchService;

    @Override
    public BookCheckout checkoutBookItem(BookItem bookItem, Member member) {
        BookReservation bookReservation = bookingService.getReservationByBookItem(bookItem);
        if(bookReservation != null && !bookReservation.getMember().equals(member)){
            throw new LibraryException();
        }else if(bookReservation != null){
            bookReservation.setReservationStatus(ReservationStatus.COMPLETED);
        }
        BookCheckout bookCheckout = bookingService.checkOutBookItem(bookItem, member);
        return bookCheckout;
    }

    @Override
    public BookReservation reserveABookItem(BookItem bookItem, Member member) {
        if(!bookItem.getBookItemStatus().equals(BookItemStatus.AVAILABLE)){
            System.out.println("Book Item is not available to reserve");
            throw new LibraryException();
        }

        BookReservation bookReservation = bookingService.reserveABookItem(bookItem, member);

        return bookReservation;
    }

    @Override
    public void returnBookItem(BookItem bookItem) {

        BookCheckout bookCheckout = bookingService.getCheckoutByBookItem(bookItem);
        Fine fine = fineService.getFine(bookCheckout);
        fineService.collectFine(fine);

        if(!fine.getFineStatus().equals(FineStatus.PAID)){
            throw new LibraryException();
        }

        bookingService.checkInBookItem(bookItem);

    }

    @Override
    public BookCheckout renewBookItem(BookItem bookItem, Member member) {

        BookReservation bookReservation = bookingService.getReservationByBookItem(bookItem);
        if(bookReservation != null && !bookReservation.getMember().equals(member)){
            System.out.println("This book is reserved by other person");
            throw new LibraryException();
        }else if(bookReservation != null){
            bookReservation.setReservationStatus(ReservationStatus.COMPLETED);
        }
        BookCheckout bookCheckout = bookingService.getCheckoutByBookItem(bookItem);
        bookCheckout.setDueDate(LocalDateTime.now().plusDays(10));
        return bookCheckout;
    }

    @Override
    public List<Book> searchByTitle(String titleName) {
        return searchService.searchByTitle(titleName);
    }

    @Override
    public List<Book> searchByAuthor(String authorName) {
        return searchService.searchByAuthor(authorName);
    }

    @Override
    public List<Book> searchByCategory(Category category) {
        return searchService.searchByCategory(category);
    }

    @Override
    public List<Book> searchByPublicationDate(LocalDate localDate) {
        return searchService.searchByPublicationDate(localDate);
    }
}
