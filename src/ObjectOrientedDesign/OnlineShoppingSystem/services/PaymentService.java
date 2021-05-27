package ObjectOrientedDesign.OnlineShoppingSystem.services;

import ObjectOrientedDesign.OnlineShoppingSystem.entities.Transaction;
import ObjectOrientedDesign.OnlineShoppingSystem.enums.PaymentType;
import java.util.Map;

public abstract class PaymentService {

    abstract Transaction processPayment(Map<String, String> metaData);

    Transaction refundAmount(Integer transactionId, Double amount){
        return null;
    }

}
