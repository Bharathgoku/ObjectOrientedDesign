package ObjectOrientedDesign.VendingMachineV2.states;

import ObjectOrientedDesign.VendingMachineV2.enums.Denomination;
import ObjectOrientedDesign.VendingMachineV2.StateVendingMachine;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.DenominationService;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.InventoryService;
import java.util.List;

public class SoldOutState implements VendingMachineState {

    private StateVendingMachine stateVendingMachine;
    private InventoryService inventoryService;
    private DenominationService denominationService;

    public SoldOutState(StateVendingMachine stateVendingMachine,
        InventoryService inventoryService,
        DenominationService denominationService) {
        this.inventoryService = inventoryService;
        this.denominationService = denominationService;
    }

    @Override
    public Integer getPrice(String productName) {
        // get price and stay in same state
        return null;
    }

    @Override
    public Integer insertAmount(List<Denomination> insertedAmount) {
        // items are sold out , amount is not accepting, call refund method
        System.out.println("items are sold out, Refund is initiated");
        stateVendingMachine.refundAmount(insertedAmount);
        return null;
    }

    @Override
    public String selectItem(String itemName) {
        // items are sold out
        System.out.println("Items are sold out");
        return null;
    }

    @Override
    public String dispenseItem() {
        // items are sold out
        System.out.println("Items are sold out, Nothing to dispense");
        return null;
    }

    @Override
    public List<Denomination> refundAmount() {
        // No amount is inserted to refund
        System.out.println("No amount is present to refund");
        return null;
    }

    @Override
    public void addItem(String name, Integer quantity) {
        // add item and move to idle state
        inventoryService.addProduct(name, quantity);
        stateVendingMachine.setCurrentState(stateVendingMachine.getIdleState());
    }

    @Override
    public void removeItem(String name) {
        // no item is present to remove
        System.out.println("There are no items to remove");
    }

    @Override
    public void addDenominations(List<Denomination> denominations) {
        // add denomination and stay in same stay in same state
        denominationService.addDenomination(denominations);
    }

    @Override
    public void removeDenominations(List<Denomination> denominations) {
        // remove denomination and stay in same state
    }
}
