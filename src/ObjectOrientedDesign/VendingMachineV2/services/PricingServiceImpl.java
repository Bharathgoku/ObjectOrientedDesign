package ObjectOrientedDesign.VendingMachineV2.services;

import ObjectOrientedDesign.VendingMachineV2.DataStore.PricingData;
import ObjectOrientedDesign.VendingMachineV2.exceptions.PriceNotAvailableException;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.PricingService;

public class PricingServiceImpl implements PricingService {

    private PricingData pricingData;

    public PricingServiceImpl(PricingData pricingData){
        this.pricingData = pricingData;
    }

    @Override
    public void addPrice(String productName, Integer price){
        pricingData.getMap().put(productName, price);
    }

    @Override
    public int getPrice(String productName){
        Integer price = pricingData.getMap().get(productName);
        if(price == null){
            throw new PriceNotAvailableException();
        }
        return price;
    }

}
