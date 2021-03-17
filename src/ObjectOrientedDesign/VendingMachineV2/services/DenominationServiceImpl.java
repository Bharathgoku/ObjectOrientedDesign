package ObjectOrientedDesign.VendingMachineV2.services;

import ObjectOrientedDesign.VendingMachineV2.Denomination;
import ObjectOrientedDesign.VendingMachineV2.DataStore.DenominationData;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.DenominationService;

public class DenominationServiceImpl implements DenominationService {

    private DenominationData denominationData;

    public DenominationServiceImpl(DenominationData denominationData){
        this.denominationData = denominationData;
    }

    @Override
    public void addDenomination(Denomination denomination, Integer count){
        denominationData.getMap().put(denomination, denominationData.getMap().getOrDefault(denomination, 0)+count);
    }

    @Override
    public Integer getCount(Denomination denomination){
        return denominationData.getMap().get(denomination);
    }

}
