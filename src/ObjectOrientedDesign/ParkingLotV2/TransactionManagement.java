package ObjectOrientedDesign.ParkingLotV2;

import static ObjectOrientedDesign.ParkingLotV2.PaymentType.CARD;
import static ObjectOrientedDesign.ParkingLotV2.PaymentType.CASH;
import static ObjectOrientedDesign.ParkingLotV2.PaymentType.UPI;

import java.util.List;
import java.util.Map;

public class TransactionManagement {

    private Map<Integer, Transaction> transactionMap;

    public Transaction createTransaction(PaymentType paymentType, Double amount, Map<String, String> metadata){
        switch(paymentType){
            case CARD: {

            }
            case UPI: {

            }
            case CASH: {

            }
            default: {

            }
        }
        Transaction transaction = new Transaction(amount, metadata);
        transactionMap.put(transaction.getTransactionId(), transaction);
        return null;
    }

    public Transaction getTransaction(Integer transactionId){
        return transactionMap.get(transactionId);
    }

}
