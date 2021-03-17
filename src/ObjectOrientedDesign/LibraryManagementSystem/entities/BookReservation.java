package ObjectOrientedDesign.LibraryManagementSystem.entities;

import ObjectOrientedDesign.LibraryManagementSystem.enums.ReservationStatus;
import java.time.LocalDateTime;

public class BookReservation {

    private Integer reservationId;
    private Member member;
    private BookItem bookItem;
    private LocalDateTime reservationTime;
    private ReservationStatus reservationStatus;
    private static Integer counter = 1;

    public BookReservation(Member member,
        BookItem bookItem, LocalDateTime reservationTime,
        ReservationStatus reservationStatus) {
        this.member = member;
        this.bookItem = bookItem;
        this.reservationTime = reservationTime;
        this.reservationStatus = reservationStatus;
        setReservationId();
    }

    private void setReservationId(){
        this.reservationId = counter;
        counter++;
    }

    public BookItem getBookItem() {
        return bookItem;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(
        ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public Member getMember() {
        return member;
    }
}
