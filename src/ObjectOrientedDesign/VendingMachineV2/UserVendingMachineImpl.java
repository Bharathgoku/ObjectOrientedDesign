package ObjectOrientedDesign.VendingMachineV2;

import ObjectOrientedDesign.VendingMachineV2.enums.Denomination;
import java.util.List;

public class UserVendingMachineImpl implements UserVendingMachine{

    private StateVendingMachine stateVendingMachine;

    public UserVendingMachineImpl(
        StateVendingMachine stateVendingMachine) {
        this.stateVendingMachine = stateVendingMachine;
    }

    @Override
    public Integer getPrice(String productName) {
        return stateVendingMachine.getCurrentState().getPrice(productName);
    }

    @Override
    public Integer insertAmount(List<Denomination> insertedAmount) {
        return stateVendingMachine.getCurrentState().insertAmount(insertedAmount);
    }

    @Override
    public void selectItem(String itemName) {
        stateVendingMachine.getCurrentState().selectItem(itemName);
        stateVendingMachine.getCurrentState().dispenseItem();
        stateVendingMachine.getCurrentState().refundAmount();
    }
}
