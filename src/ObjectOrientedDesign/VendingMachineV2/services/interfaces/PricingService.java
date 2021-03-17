package ObjectOrientedDesign.VendingMachineV2.services.interfaces;

public interface PricingService {

    void addPrice(String productName, Integer price);

    int getPrice(String productName);

}
