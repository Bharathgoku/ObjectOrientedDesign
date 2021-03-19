package ObjectOrientedDesign.VendingMachineV2;

import ObjectOrientedDesign.VendingMachineV2.enums.Denomination;
import java.util.List;

public interface AdminVendingMachine {

    void addItem(String name, Integer quantity);

    void removeItem(String name);

    void addDenominations(List<Denomination> denominationList);

    void removeDenomination(List<Denomination> denominationList);

}
