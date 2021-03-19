package ObjectOrientedDesign.VendingMachineV2.states;

import ObjectOrientedDesign.VendingMachine.Inventory;
import ObjectOrientedDesign.VendingMachineV2.enums.Denomination;
import ObjectOrientedDesign.VendingMachineV2.StateVendingMachine;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.DenominationService;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.InventoryService;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.PricingService;
import java.util.List;

public class IdleState implements VendingMachineState {

    private StateVendingMachine stateVendingMachine;
    private PricingService pricingService;
    private InventoryService inventoryService;
    private DenominationService denominationService;

    public IdleState(StateVendingMachine stateVendingMachine,
        PricingService pricingService,
        InventoryService inventoryService,
        DenominationService denominationService) {
        this.stateVendingMachine = stateVendingMachine;
        this.pricingService = pricingService;
        this.inventoryService = inventoryService;
        this.denominationService = denominationService;
    }

    @Override
    public Integer getPrice(String productName) {
        Integer amount = pricingService.getPrice(productName);
        System.out.println("Price for the Product : " + productName + " is - " + amount);
        return amount;
    }

    @Override
    public Integer insertAmount(List<Denomination> insertedAmount) {
        // calculate amount and change to amount inserted state
        Integer amount = denominationService.calculateInsertedAmount(insertedAmount);
        stateVendingMachine.setInsertedAmount(amount);
        stateVendingMachine.setCurrentState(stateVendingMachine.getAmountInsertedState());
        System.out.println("Amount Inserted : " + amount);
        return amount;
    }

    @Override
    public String selectItem(String itemName) {
        // can't select the item before inserting the amount
        System.out.println("Please insert amount before selecting the item");
        return null;
    }

    @Override
    public String dispenseItem() {
        // can't dispense the item without selecting the item
        System.out.println("Cannot dispense the item without paying");
        return null;
    }

    @Override
    public List<Denomination> refundAmount() {
        // no amount is present to refund
        System.out.println("No amount to refund, please insert the amount");
        return null;
    }

    @Override
    public void addItem(String name, Integer quantity) {
        // add items in idle state and stay in same state
        inventoryService.addProduct(name, quantity);
    }

    @Override
    public void removeItem(String name) {
        // remove item and move to sold out or stay in same state
        inventoryService.removeProduct(name);
        if(inventoryService.isOutOfItems())
            stateVendingMachine.setCurrentState(stateVendingMachine.getSoldOutState());
    }

    @Override
    public void addDenominations(List<Denomination> denominations) {
        // add denomination and stay in same state
        denominationService.addDenomination(denominations);
    }

    @Override
    public void removeDenominations(List<Denomination> denominations) {
        // remove denomination and stay in same state
    }
}
