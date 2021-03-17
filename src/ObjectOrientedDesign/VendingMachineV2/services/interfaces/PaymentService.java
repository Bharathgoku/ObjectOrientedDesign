package ObjectOrientedDesign.VendingMachineV2.services.interfaces;

import ObjectOrientedDesign.VendingMachineV2.Denomination;
import java.util.List;

public interface PaymentService {

    Integer calculateInsertedAmount(List<Denomination> insertedAmount);

    void addInsertedAmount(List<Denomination> insertedAmount);

    void refundAmount(Integer amount);

}
