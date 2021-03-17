package ObjectOrientedDesign.VendingMachineV2;

import ObjectOrientedDesign.VendingMachineV2.DataStore.DenominationData;
import ObjectOrientedDesign.VendingMachineV2.DataStore.InventoryData;
import ObjectOrientedDesign.VendingMachineV2.DataStore.PricingData;
import ObjectOrientedDesign.VendingMachineV2.services.InventoryServiceImpl;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.DenominationService;
import ObjectOrientedDesign.VendingMachineV2.services.DenominationServiceImpl;
import ObjectOrientedDesign.VendingMachineV2.services.PaymentServiceImpl;
import ObjectOrientedDesign.VendingMachineV2.services.PricingServiceImpl;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.PaymentService;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args){

    }

    private static void initialize(){
        DenominationData denominationData = new DenominationData(new HashMap<>());
        DenominationService denominationService = new DenominationServiceImpl(denominationData);
        denominationService.addDenomination(Denomination.PENNY, 100);
        denominationService.addDenomination(Denomination.NICKEL, 100);
        denominationService.addDenomination(Denomination.DIME, 100);
        denominationService.addDenomination(Denomination.QUARTER, 100);

        PaymentService paymentService = new PaymentServiceImpl(denominationService);
        InventoryData inventoryData = new InventoryData(new HashMap<>());
        InventoryServiceImpl inventoryService = new InventoryServiceImpl(inventoryData);

        inventoryService.addProduct("Coke", 10);
        inventoryService.addProduct("Pepsi", 15);
        inventoryService.addProduct("Soda", 20);

        PricingData pricingData = new PricingData(new HashMap<>());

        PricingServiceImpl pricingService = new PricingServiceImpl(pricingData);

        pricingService.addPrice("Coke", 25);
        pricingService.addPrice("Pepsi", 35);
        pricingService.addPrice("Soda", 45);

        VendingMachineSystem vendingMachineSystem = new VendingMachineSystem(inventoryService, paymentService,
            pricingService);


        Integer price = vendingMachineSystem.getPrice("Coke");

        List<Denomination> denominationList = Arrays.asList(Denomination.DIME, Denomination.DIME, Denomination.DIME);

        vendingMachineSystem.insertAmountAndSelectItem(denominationList, "Coke");

        AdminVendingMachine adminVendingMachine = vendingMachineSystem;

        UserVendingMachine userVendingMachine = vendingMachineSystem;



    }
}
