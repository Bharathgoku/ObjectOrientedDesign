package ObjectOrientedDesign.VendingMachine;

import java.util.List;

public interface VendingMachine {

    Integer selectItemAndGetPrice(Item item);

    boolean collectMoneyAndValidate(List<Denomination> denominationList, Item item);

    Item getItem();

    List<Denomination> remainingAmount();

    Item getSelectedItem();

    List<Denomination> getDenominationList();

}
