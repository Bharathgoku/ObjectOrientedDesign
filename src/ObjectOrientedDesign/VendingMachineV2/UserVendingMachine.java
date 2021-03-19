package ObjectOrientedDesign.VendingMachineV2;

import ObjectOrientedDesign.VendingMachineV2.enums.Denomination;
import java.util.List;

public interface UserVendingMachine {

    Integer getPrice(String productName);

    Integer insertAmount(List<Denomination> insertedAmount);

    void selectItem(String itemName);


}
