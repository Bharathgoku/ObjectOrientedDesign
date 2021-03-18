package ObjectOrientedDesign.MovieTicketBookingSystem.services;

import ObjectOrientedDesign.MovieTicketBookingSystem.entities.Transaction;
import ObjectOrientedDesign.MovieTicketBookingSystem.enums.PaymentType;
import java.util.Map;

public interface PaymentService {

    Transaction processTransaction(PaymentType paymentType, Map<String, String> metaData);

}
