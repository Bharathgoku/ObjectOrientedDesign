package ObjectOrientedDesign.VendingMachineV2.DataStore;

import java.util.Map;

public class InventoryData {

    Map<String, Integer> map;

    public InventoryData(Map<String, Integer> map) {
        this.map = map;
    }

    public Map<String, Integer> getMap() {
        return map;
    }
}
