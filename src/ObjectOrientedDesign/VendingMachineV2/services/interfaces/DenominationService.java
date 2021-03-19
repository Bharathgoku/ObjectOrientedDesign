package ObjectOrientedDesign.VendingMachineV2.services.interfaces;

import ObjectOrientedDesign.VendingMachineV2.enums.Denomination;
import java.util.List;

public interface DenominationService {

    Integer getCount(Denomination denomination);

    Integer calculateInsertedAmount(List<Denomination> insertedAmount);

    void addDenomination(List<Denomination> insertedAmount);

    List<Denomination> refundAmount(Integer amount);

}
