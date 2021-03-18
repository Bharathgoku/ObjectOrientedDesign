package ObjectOrientedDesign.MovieTicketBookingSystem.entities;

import ObjectOrientedDesign.MovieTicketBookingSystem.enums.PaymentType;
import ObjectOrientedDesign.MovieTicketBookingSystem.enums.TransactionStatus;

public class Transaction {

    private Integer transactionId;
    private Ticket ticket;
    private Double amount;
    private TransactionStatus transactionStatus;
    private PaymentType paymentType;

}
