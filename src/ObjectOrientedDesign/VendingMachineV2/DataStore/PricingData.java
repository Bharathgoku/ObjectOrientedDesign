package ObjectOrientedDesign.VendingMachineV2.DataStore;

import java.util.Map;

public class PricingData {

    private Map<String, Integer> map;

    public PricingData(Map<String, Integer> map) {
        this.map = map;
    }

    public Map<String, Integer> getMap() {
        return map;
    }
}
