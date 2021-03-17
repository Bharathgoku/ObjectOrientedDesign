package ObjectOrientedDesign.VendingMachineV2.DataStore;

import ObjectOrientedDesign.VendingMachineV2.Denomination;
import java.util.Map;

public class DenominationData {

    Map<Denomination, Integer> map;

    public DenominationData(
        Map<Denomination, Integer> map) {
        this.map = map;
    }

    public Map<Denomination, Integer> getMap() {
        return map;
    }
}
