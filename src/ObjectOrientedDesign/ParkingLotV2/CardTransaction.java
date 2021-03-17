package ObjectOrientedDesign.ParkingLotV2;

import java.util.Map;

public class CardTransaction extends Transaction{


    private PaymentType paymentType = PaymentType.CARD;

    public CardTransaction(Double amount,
        Map<String, String> transactionMetaData) {
        super(amount, transactionMetaData);
    }


    public void validateTransaction(){

    }
}
