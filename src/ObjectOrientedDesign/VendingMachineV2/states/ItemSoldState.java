package ObjectOrientedDesign.VendingMachineV2.states;

import ObjectOrientedDesign.VendingMachineV2.enums.Denomination;
import ObjectOrientedDesign.VendingMachineV2.StateVendingMachine;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.DenominationService;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.InventoryService;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.PricingService;
import java.util.List;

public class ItemSoldState implements VendingMachineState {

    private StateVendingMachine stateVendingMachine;
    private InventoryService inventoryService;
    private DenominationService denominationService;

    public ItemSoldState(StateVendingMachine stateVendingMachine,
        InventoryService inventoryService,
        DenominationService denominationService) {
        this.stateVendingMachine = stateVendingMachine;
        this.inventoryService = inventoryService;
        this.denominationService = denominationService;
    }

    @Override
    public Integer getPrice(String productName) {
        // Wait for the amount to refund, try after some time
        return null;
    }

    @Override
    public Integer insertAmount(List<Denomination> insertedAmount) {
        // Amount is already inserted waiting for amount to refund
        return null;
    }

    @Override
    public String selectItem(String itemName) {
        // item is already selected, waiting for amount to refund
        return null;
    }

    @Override
    public String dispenseItem() {
        // item is already dispensed, waiting for amount to refund
        return null;
    }

    @Override
    public List<Denomination> refundAmount() {
        // refund the remaining amount and change to idle / sold out state

        Integer refundAmount = stateVendingMachine.getRefundAmount();

        if(refundAmount > 0){
            List<Denomination> denominationList = denominationService.refundAmount(refundAmount);
            stateVendingMachine.refundAmount(denominationList);
        }

        if(inventoryService.isOutOfItems()){
            stateVendingMachine.setCurrentState(stateVendingMachine.getSoldOutState());
        }else
            stateVendingMachine.setCurrentState(stateVendingMachine.getIdleState());

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
