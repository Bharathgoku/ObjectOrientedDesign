package ObjectOrientedDesign.ParkingLotV2;

import ObjectOrientedDesign.ParkingLotV2.exceptions.TicketInvalidException;
import java.util.HashMap;
import java.util.Map;

public class PaymentService {

    private TransactionManagement transactionmanagement;

    private ParkingLotSystem parkingLotSystem;

    public PaymentService(TransactionManagement transactionmanagement,
        ParkingLotSystem parkingLotSystem) {
        this.transactionmanagement = transactionmanagement;
        this.parkingLotSystem = parkingLotSystem;
    }

    public Double calculateAmount(Integer ticketId) throws TicketInvalidException {
        Ticket ticket = parkingLotSystem.getTicket(ticketId);
        // do some calculation
        Double amount = 0.0;
        return amount;
    }

    public Transaction makePayment(PaymentType paymentType, Map<String, String> metaData){
        Double amount = Double.valueOf(metaData.get("amount"));
        Integer ticketId = Integer.valueOf(metaData.get("ticket_id"));
        Map<String, String> transactionMetaData = new HashMap<>();

        Transaction transaction = transactionmanagement.createTransaction(paymentType, amount, transactionMetaData);
        transaction = processPayment(transaction);
        return transaction;
    }

    private Transaction processPayment(Transaction transaction){

        // do the process for changing pending state to completed/cancelled state
        return transaction;
    }

}
