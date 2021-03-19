package ObjectOrientedDesign.VendingMachineV2.services;

import ObjectOrientedDesign.VendingMachineV2.enums.Denomination;
import ObjectOrientedDesign.VendingMachineV2.DataStore.DenominationData;
import ObjectOrientedDesign.VendingMachineV2.exceptions.InsufficientAmountException;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.DenominationService;
import java.util.ArrayList;
import java.util.List;

public class DenominationServiceImpl implements DenominationService {

    private DenominationData denominationData;

    public DenominationServiceImpl(DenominationData denominationData){
        this.denominationData = denominationData;
    }

    @Override
    public Integer getCount(Denomination denomination){
        return denominationData.getMap().get(denomination);
    }

    @Override
    public Integer calculateInsertedAmount(List<Denomination> insertedAmount) {
        Integer total = 0;
        for(Denomination denomination : insertedAmount){
            total += denomination.getVal();
        }

        return total;
    }

    @Override
    public void addDenomination(List<Denomination> insertedAmount) {

    }

    @Override
    public List<Denomination> refundAmount(Integer amount) {
        List<Denomination> denominationList = new ArrayList<>();

        if(amount/(Denomination.QUARTER.getVal()) > 0 && getCount(Denomination.QUARTER) != 0){
            int count = amount/(Denomination.QUARTER.getVal());
            while(getCount(Denomination.QUARTER) != 0 && count-- != 0)
                denominationList.add(Denomination.QUARTER);

            amount = amount - (count * Denomination.QUARTER.getVal());
        }
        if(amount /(Denomination.DIME.getVal()) > 0 && getCount(Denomination.DIME) != 0) {
            int count = amount/(Denomination.DIME.getVal());
            while(getCount(Denomination.DIME) != 0  && count-- != 0)
                denominationList.add(Denomination.DIME);
        }

        if(amount/(Denomination.NICKEL.getVal()) > 0 && getCount(Denomination.NICKEL) != 0){
            int count = amount/(Denomination.NICKEL.getVal());
            while(getCount(Denomination.NICKEL) != 0 && count-- != 0)
                denominationList.add(Denomination.NICKEL);
        }

        if(amount/(Denomination.PENNY.getVal())> 0 && getCount(Denomination.PENNY) != 0){
            int count = amount/(Denomination.PENNY.getVal());
            while(getCount(Denomination.PENNY) != 0 && count-- != 0)
                denominationList.add(Denomination.PENNY);
        }

        if(amount > 0){
            throw new InsufficientAmountException();
        }
        return denominationList;
    }

}
