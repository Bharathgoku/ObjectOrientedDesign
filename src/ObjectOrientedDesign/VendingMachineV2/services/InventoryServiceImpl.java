package ObjectOrientedDesign.VendingMachineV2.services;

import ObjectOrientedDesign.VendingMachineV2.DataStore.InventoryData;
import ObjectOrientedDesign.VendingMachineV2.exceptions.InsufficientQuantityException;
import ObjectOrientedDesign.VendingMachineV2.exceptions.ItemNotFoundException;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.InventoryService;

public class InventoryServiceImpl implements InventoryService {

    private InventoryData inventoryData;

    public InventoryServiceImpl(InventoryData inventoryData){
        this.inventoryData = inventoryData;
    }

    @Override
    public void addProduct(String productName, Integer noOfItems){
        inventoryData.getMap().put(productName, inventoryData.getMap().getOrDefault(productName, 0)+noOfItems);
    }

    @Override
    public void removeProduct(String productName){
        inventoryData.getMap().remove(productName);
    }

    @Override
    public void getItem(String productName){
        if(inventoryData.getMap().get(productName) == null) {
            throw new ItemNotFoundException();
        }

        if(inventoryData.getMap().get(productName) == 0){
            throw new InsufficientQuantityException();
        }

        inventoryData.getMap().put(productName, inventoryData.getMap().get(productName)-1);
    }

    public boolean isOutOfItems(){
        return false;
    }
}
