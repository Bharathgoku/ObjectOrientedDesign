package ObjectOrientedDesign.VendingMachineV2;

import ObjectOrientedDesign.VendingMachineV2.enums.Denomination;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.DenominationService;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.InventoryService;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.PricingService;
import ObjectOrientedDesign.VendingMachineV2.states.AmountInsertedState;
import ObjectOrientedDesign.VendingMachineV2.states.IdleState;
import ObjectOrientedDesign.VendingMachineV2.states.ItemSoldState;
import ObjectOrientedDesign.VendingMachineV2.states.ProductSelectedState;
import ObjectOrientedDesign.VendingMachineV2.states.SoldOutState;
import ObjectOrientedDesign.VendingMachineV2.states.VendingMachineState;
import java.util.List;

public class StateVendingMachine {

    private VendingMachineState idleState;
    private VendingMachineState amountInsertedState;
    private VendingMachineState productSelectedState;
    private VendingMachineState itemSoldState;
    private VendingMachineState soldOutState;

    private VendingMachineState currentState;
    private InventoryService inventoryService;

    private Integer insertedAmount;
    private String selectedItem;
    private Integer refundAmount;

    public StateVendingMachine(PricingService pricingService,
        DenominationService denominationService,
        InventoryService inventoryService) {
        this.idleState = new IdleState(this, pricingService, inventoryService, denominationService);
        this.amountInsertedState = new AmountInsertedState(this, pricingService);
        this.productSelectedState = new ProductSelectedState(this, pricingService);
        this.itemSoldState = new ItemSoldState(this, inventoryService, denominationService);
        this.soldOutState = new SoldOutState(this, inventoryService, denominationService);
        this.insertedAmount = 0;
        this.refundAmount = 0;
        this.selectedItem = null;
        this.inventoryService = inventoryService;

        if(!inventoryService.isOutOfItems()){
            this.currentState = idleState;
        }else
            this.currentState = soldOutState;

    }

    public VendingMachineState getIdleState() {
        return idleState;
    }

    public VendingMachineState getAmountInsertedState() {
        return amountInsertedState;
    }

    public VendingMachineState getProductSelectedState() {
        return productSelectedState;
    }

    public VendingMachineState getItemSoldState() {
        return itemSoldState;
    }

    public VendingMachineState getSoldOutState() {
        return soldOutState;
    }

    public void setCurrentState(VendingMachineState currentState) {
        this.currentState = currentState;
    }

    public VendingMachineState getCurrentState() {
        return currentState;
    }

    public Integer getInsertedAmount() {
        return insertedAmount;
    }

    public void setInsertedAmount(Integer insertedAmount) {
        this.insertedAmount = insertedAmount;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void resetMachine(){
        this.setInsertedAmount(0);
        this.setSelectedItem(null);
        this.setRefundAmount(0);
    }

    public void dispenseItem(){
        System.out.println("Item dispensed");
    }

    public void refundAmount(List<Denomination> denominationsList){
        System.out.println("Refunding amount");
    }

    public void setIdleState(VendingMachineState idleState) {
        this.idleState = idleState;
    }

    public void setAmountInsertedState(
        VendingMachineState amountInsertedState) {
        this.amountInsertedState = amountInsertedState;
    }

    public void setProductSelectedState(
        VendingMachineState productSelectedState) {
        this.productSelectedState = productSelectedState;
    }

    public void setItemSoldState(
        VendingMachineState itemSoldState) {
        this.itemSoldState = itemSoldState;
    }

    public void setSoldOutState(
        VendingMachineState soldOutState) {
        this.soldOutState = soldOutState;
    }
}
