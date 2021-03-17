package ObjectOrientedDesign.FoodDeliveryApp.services;

import ObjectOrientedDesign.FoodDeliveryApp.DataStore.PaymentData;
import ObjectOrientedDesign.FoodDeliveryApp.entities.Transaction;
import ObjectOrientedDesign.FoodDeliveryApp.enums.PaymentType;
import ObjectOrientedDesign.FoodDeliveryApp.services.interfaces.PaymentService;
import java.util.Map;

public class PaymentServiceImpl implements PaymentService {
        private PaymentData paymentData;

        @Override
        public Transaction processPayment(Map<String, String> PaymentMetaData,
            PaymentType paymentType) {
                return null;
        }
}
