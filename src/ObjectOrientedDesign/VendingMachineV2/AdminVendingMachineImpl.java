package ObjectOrientedDesign.VendingMachineV2;

import ObjectOrientedDesign.VendingMachineV2.enums.Denomination;
import java.util.List;

public class AdminVendingMachineImpl implements AdminVendingMachine{

    private StateVendingMachine stateVendingMachine;

    public AdminVendingMachineImpl(
        StateVendingMachine stateVendingMachine) {
        this.stateVendingMachine = stateVendingMachine;
    }

    @Override
    public void addItem(String name, Integer quantity) {
        stateVendingMachine.getCurrentState().addItem(name, quantity);
    }

    @Override
    public void removeItem(String name) {
        stateVendingMachine.getCurrentState().removeItem(name);
    }

    @Override
    public void addDenominations(List<Denomination> denominations) {
        stateVendingMachine.getCurrentState().addDenominations(denominations);
    }

    @Override
    public void removeDenomination(List<Denomination> denominationList) {
        stateVendingMachine.getCurrentState().removeDenominations(denominationList);
    }
}
