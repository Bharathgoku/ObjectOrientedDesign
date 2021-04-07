package ObjectOrientedDesign.OnlineShoppingSystem.services;

import ObjectOrientedDesign.OnlineShoppingSystem.entities.Transaction;
import ObjectOrientedDesign.OnlineShoppingSystem.enums.PaymentType;
import java.util.Map;

public interface PaymentService {

    Transaction processPayment(PaymentType paymentType, Map<String, String> metaData);

    Transaction refundAmount(Integer transactionId, Double amount);

}
