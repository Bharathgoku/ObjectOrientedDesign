package ObjectOrientedDesign.VendingMachineV2;

import java.util.List;

public interface UserVendingMachine {

    int getPrice(String productName);

    void insertAmountAndSelectItem(List<Denomination> insertedAmount, String productName);

    void addDenominations(List<Denomination> denominations);

}
