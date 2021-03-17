package ObjectOrientedDesign.VendingMachineV2;

import ObjectOrientedDesign.VendingMachineV2.exceptions.InsufficientAmountException;
import ObjectOrientedDesign.VendingMachineV2.exceptions.InsufficientQuantityException;
import ObjectOrientedDesign.VendingMachineV2.exceptions.ItemNotFoundException;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.DenominationService;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.InventoryService;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.PaymentService;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.PricingService;
import java.util.List;

public class VendingMachineSystem implements UserVendingMachine, AdminVendingMachine{
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private PricingService pricingService;
    private DenominationService denominationService;

    private String selectedItem;
    private Integer insertedAmount;

    public VendingMachineSystem(InventoryService inventoryService,
        PaymentService paymentService,
        PricingService pricingService) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.pricingService = pricingService;
    }

    @Override
    public int getPrice(String productName){
        return pricingService.getPrice(productName);
    }

    @Override
    public void insertAmountAndSelectItem(List<Denomination> insertedAmount, String productName){
        selectedItem = productName;
        Integer amount = paymentService.calculateInsertedAmount(insertedAmount);
        paymentService.addInsertedAmount(insertedAmount);
        try {
            Integer price = pricingService.getPrice(productName);
            if(price > amount) {
                paymentService.refundAmount(amount);
                throw new InsufficientQuantityException();
            }
            paymentService.refundAmount(amount-price);
            inventoryService.getItem(selectedItem);
        }catch(ItemNotFoundException | InsufficientQuantityException | InsufficientAmountException ex){
            paymentService.refundAmount(amount);
            throw ex;
        }
    }

    @Override
    public void addItem(String name, Integer quantity){
        inventoryService.addProduct(name, quantity);
    }

    @Override
    public void removeItem(String name){
        inventoryService.removeProduct(name);
    }

    @Override
    public void addDenominations(List<Denomination> denominations){
        for(Denomination denomination : denominations){
            denominationService.addDenomination(denomination, 1);
        }
    }

}
