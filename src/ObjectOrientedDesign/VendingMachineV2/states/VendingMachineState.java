package ObjectOrientedDesign.VendingMachineV2.states;

import ObjectOrientedDesign.VendingMachineV2.enums.Denomination;
import java.util.List;

public interface VendingMachineState {

    Integer getPrice(String productName);

    Integer insertAmount(List<Denomination> insertedAmount);

    String selectItem(String itemName);

    String dispenseItem();

    List<Denomination> refundAmount();

    void addItem(String name, Integer quantity);

    void removeItem(String name);

    void addDenominations(List<Denomination> denominations);

    void removeDenominations(List<Denomination> denominations);

}
