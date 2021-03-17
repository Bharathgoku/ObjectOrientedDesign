package ObjectOrientedDesign.ParkingLotV2;

import java.util.Map;

public class UpiTransaction extends Transaction{

    private PaymentType paymentType = PaymentType.UPI;

    public UpiTransaction(Double amount,
        Map<String, String> transactionMetaData) {
        super(amount, transactionMetaData);
    }


    public void validateTransaction(){

    }
}
