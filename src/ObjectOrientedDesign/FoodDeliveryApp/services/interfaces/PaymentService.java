package ObjectOrientedDesign.FoodDeliveryApp.services.interfaces;

import ObjectOrientedDesign.FoodDeliveryApp.entities.Transaction;
import ObjectOrientedDesign.FoodDeliveryApp.enums.PaymentType;
import java.util.Map;

public interface PaymentService {

    Transaction processPayment(Map<String, String> PaymentMetaData, PaymentType paymentType);

}
