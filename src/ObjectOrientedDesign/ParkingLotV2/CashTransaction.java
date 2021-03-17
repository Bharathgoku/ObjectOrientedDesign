package ObjectOrientedDesign.ParkingLotV2;

import java.util.Map;

public class CashTransaction extends Transaction{

    private PaymentType paymentType = PaymentType.CASH;

    public CashTransaction(Double amount,
        Map<String, String> transactionMetaData) {
        super(amount, transactionMetaData);
    }

    public void validateTransaction(){

    }
}
