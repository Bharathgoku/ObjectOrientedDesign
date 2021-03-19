package ObjectOrientedDesign.VendingMachineV2.services.interfaces;

public interface InventoryService {

    void addProduct(String productName, Integer noOfItems);

    void removeProduct(String productName);

    void getItem(String productName);

    boolean isOutOfItems();


}
