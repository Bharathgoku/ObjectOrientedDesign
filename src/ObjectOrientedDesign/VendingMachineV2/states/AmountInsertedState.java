package ObjectOrientedDesign.VendingMachineV2.states;

import ObjectOrientedDesign.VendingMachineV2.enums.Denomination;
import ObjectOrientedDesign.VendingMachineV2.StateVendingMachine;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.PricingService;
import java.util.List;

public class AmountInsertedState implements VendingMachineState {

    private StateVendingMachine stateVendingMachine;
    private PricingService pricingService;

    public AmountInsertedState(
        StateVendingMachine stateVendingMachine,
        PricingService pricingService) {
        this.stateVendingMachine = stateVendingMachine;
        this.pricingService = pricingService;
    }

    @Override
    public Integer getPrice(String productName) {
        // amount already inserted
        System.out.println("Amount already inserted, Please try after sometime !!");
        return null;
    }

    @Override
    public Integer insertAmount(List<Denomination> insertedAmount) {
        // amount already inserted
        System.out.println("Amount is already inserted, Please select the item for dispense");
        return null;
    }

    @Override
    public String selectItem(String itemName) {
        // selected the item and check if item is present or not and change to product selected state
        // or if item is not present call refund amount
        System.out.println("Product selected is : " + itemName);
        stateVendingMachine.setSelectedItem(itemName);
        stateVendingMachine.setCurrentState(stateVendingMachine.getProductSelectedState());
        return null;
    }

    @Override
    public String dispenseItem() {
        // item is not selected yet, select item to dispense
        System.out.println("Please select the Item to dispense");
        return null;
    }

    @Override
    public List<Denomination> refundAmount() {
        // item is not selected yet, please select the item first
        System.out.println("Item is not selected yet, Please select the item first");
        return null;
    }

    @Override
    public void addItem(String name, Integer quantity) {
        System.out.println("Item can't be added now, try after sometime");
    }

    @Override
    public void removeItem(String name) {
        System.out.println("Item can't be removed not, try after sometime");
    }

    @Override
    public void addDenominations(List<Denomination> denominations) {
        System.out.println("Denominations can't be added now, try after sometime");
    }

    @Override
    public void removeDenominations(List<Denomination> denominations) {
        System.out.println("Denominations can't be remove noe, try after sometime");
    }
}
