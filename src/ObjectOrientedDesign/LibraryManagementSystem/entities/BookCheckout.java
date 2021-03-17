package ObjectOrientedDesign.LibraryManagementSystem.entities;

import ObjectOrientedDesign.LibraryManagementSystem.enums.LendingStatus;
import java.time.LocalDateTime;

public class BookCheckout {

    private BookItem bookItem;
    private LocalDateTime checkoutTime;
    private LocalDateTime dueDate;
    private LocalDateTime returnDate;
    private Member member;
    private LendingStatus lendingStatus;

    public BookCheckout(BookItem bookItem, LocalDateTime checkoutTime, Member member,
        LendingStatus lendingStatus) {
        this.bookItem = bookItem;
        this.checkoutTime = checkoutTime;
        this.member = member;
        this.lendingStatus = lendingStatus;
    }

    public BookItem getBookItem() {
        return bookItem;
    }

    public Member getMember() {
        return member;
    }


    public void setLendingStatus(
        LendingStatus lendingStatus) {
        this.lendingStatus = lendingStatus;
    }

    public void setBookItem(BookItem bookItem) {
        this.bookItem = bookItem;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}
