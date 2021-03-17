package ObjectOrientedDesign.ParkingLotV2;

import java.util.HashMap;
import java.util.Map;

public class Transaction {

    private Integer transactionId;

    private Double amount;

    private Map<String, String> transactionMetaData;

    private TransactionStatus transactionStatus;

    private static Integer counter = 1;

    private Integer ticketId;

    public Transaction(Double amount,
        Map<String, String> transactionMetaData) {
        this.amount = amount;
        this.transactionMetaData = transactionMetaData;
        setTransactionId();
    }

    private void setTransactionId() {
        this.transactionId = counter;
        counter = counter + 1;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void validateTransaction(){

    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }
}
