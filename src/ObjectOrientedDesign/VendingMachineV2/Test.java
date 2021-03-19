package ObjectOrientedDesign.VendingMachineV2;

import ObjectOrientedDesign.CacheSystem.Admin;
import ObjectOrientedDesign.VendingMachineV2.DataStore.DenominationData;
import ObjectOrientedDesign.VendingMachineV2.DataStore.InventoryData;
import ObjectOrientedDesign.VendingMachineV2.DataStore.PricingData;
import ObjectOrientedDesign.VendingMachineV2.enums.Denomination;
import ObjectOrientedDesign.VendingMachineV2.services.InventoryServiceImpl;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.DenominationService;
import ObjectOrientedDesign.VendingMachineV2.services.DenominationServiceImpl;
import ObjectOrientedDesign.VendingMachineV2.services.PricingServiceImpl;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.PaymentService;
import ObjectOrientedDesign.VendingMachineV2.states.AmountInsertedState;
import ObjectOrientedDesign.VendingMachineV2.states.IdleState;
import ObjectOrientedDesign.VendingMachineV2.states.ItemSoldState;
import ObjectOrientedDesign.VendingMachineV2.states.ProductSelectedState;
import ObjectOrientedDesign.VendingMachineV2.states.SoldOutState;
import ObjectOrientedDesign.VendingMachineV2.states.VendingMachineState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args){
        StateVendingMachine stateVendingMachine = initialize();

        AdminVendingMachine adminVendingMachine = new AdminVendingMachineImpl(stateVendingMachine);
        UserVendingMachine userVendingMachine = new UserVendingMachineImpl(stateVendingMachine);
    }

    private static StateVendingMachine  initialize(){
        DenominationData denominationData = new DenominationData(new HashMap<>());
        DenominationService denominationService = new DenominationServiceImpl(denominationData);
        List<Denomination> denominationList = new ArrayList<>(){};
        denominationService.addDenomination(denominationList);

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

        StateVendingMachine stateVendingMachine = new StateVendingMachine(pricingService, denominationService, inventoryService);

        return stateVendingMachine;

    }
}
