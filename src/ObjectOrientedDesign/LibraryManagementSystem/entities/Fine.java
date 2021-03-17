package ObjectOrientedDesign.LibraryManagementSystem.entities;

import ObjectOrientedDesign.LibraryManagementSystem.enums.FineStatus;

public class Fine {

    private Double amount;
    private FineStatus fineStatus;
    private BookCheckout bookCheckout;

    public Fine(Double amount, FineStatus fineStatus, BookCheckout bookCheckout) {
        this.amount = amount;
        this.fineStatus = fineStatus;
        this.bookCheckout = bookCheckout;
    }

    public void setFineStatus(FineStatus fineStatus) {
        this.fineStatus = fineStatus;
    }
}
