package ObjectOrientedDesign.VendingMachineV2.states;

import ObjectOrientedDesign.VendingMachineV2.enums.Denomination;
import ObjectOrientedDesign.VendingMachineV2.StateVendingMachine;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.PricingService;
import java.util.List;

public class ProductSelectedState implements VendingMachineState {

    private StateVendingMachine stateVendingMachine;
    private PricingService pricingService;

    public ProductSelectedState(
        StateVendingMachine stateVendingMachine,
        PricingService pricingService) {
        this.stateVendingMachine = stateVendingMachine;
        this.pricingService = pricingService;
    }

    @Override
    public Integer getPrice(String productName) {
        // product already selected wait for machine to dispense the item
        System.out.println("Product is selected and wait for machine to dispense the item");
        return null;
    }

    @Override
    public Integer insertAmount(List<Denomination> insertedAmount) {
        // amount is already inserted
        System.out.println("Amount is already inserted, please wait for machine to dispense the item");
        return null;
    }

    @Override
    public String selectItem(String itemName) {
        // item is already selected

        System.out.println("Item is already selected, please wait for machine to dispense the item");
        return null;
    }

    @Override
    public String dispenseItem() {
        // dispense the item and change to item sold state
        // check if item is present or not, if not present refund the amount
        System.out.println("Item is starting to dispense, please wait !!");
        Integer price = pricingService.getPrice(stateVendingMachine.getSelectedItem());
        Integer insertedAmount = stateVendingMachine.getInsertedAmount();
        if(price > insertedAmount){
            stateVendingMachine.setRefundAmount(insertedAmount);
            System.out.println("Item price is higher than inserted amount, amount refund initiated");
        }else{
            stateVendingMachine.setRefundAmount(insertedAmount - price);
            stateVendingMachine.dispenseItem();
        }
        stateVendingMachine.setCurrentState(stateVendingMachine.getItemSoldState());
        return null;
    }

    @Override
    public List<Denomination> refundAmount() {
        // item is not dispensed yet
        System.out.println("Item is not dispensed yet !!");
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
