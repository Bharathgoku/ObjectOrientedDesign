package ObjectOrientedDesign.VendingMachineV2.services.interfaces;

import ObjectOrientedDesign.VendingMachineV2.Denomination;

public interface DenominationService {

    void addDenomination(Denomination denomination, Integer count);

    Integer getCount(Denomination denomination);

}
