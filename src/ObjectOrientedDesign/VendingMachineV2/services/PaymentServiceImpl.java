package ObjectOrientedDesign.VendingMachineV2.services;

import ObjectOrientedDesign.VendingMachineV2.Denomination;
import ObjectOrientedDesign.VendingMachineV2.exceptions.InsufficientAmountException;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.DenominationService;
import ObjectOrientedDesign.VendingMachineV2.services.interfaces.PaymentService;
import java.util.ArrayList;
import java.util.List;

public class PaymentServiceImpl implements PaymentService {

    private DenominationService denominationService;

    public PaymentServiceImpl(DenominationService denominationService) {
        this.denominationService = denominationService;
    }

    @Override
    public Integer calculateInsertedAmount(List<Denomination> insertedAmount){

        Integer total = 0;
        for(Denomination denomination : insertedAmount){
            total += denomination.getVal();
        }

        return total;
    }

    @Override
    public void addInsertedAmount(List<Denomination> insertedAmount){
        for(Denomination denomination : insertedAmount){
            denominationService.addDenomination(denomination, 1);
        }
    }

    @Override
    public void refundAmount(Integer amount){

        List<Denomination> denominationList = new ArrayList<>();

        if(amount/(Denomination.QUARTER.getVal()) > 0 && denominationService.getCount(Denomination.QUARTER) != 0){
            int count = amount/(Denomination.QUARTER.getVal());
            while(denominationService.getCount(Denomination.QUARTER) != 0 && count-- != 0)
                denominationList.add(Denomination.QUARTER);

            amount = amount - (count * Denomination.QUARTER.getVal());
        }
        if(amount /(Denomination.DIME.getVal()) > 0 && denominationService.getCount(Denomination.DIME) != 0) {
            int count = amount/(Denomination.DIME.getVal());
            while(denominationService.getCount(Denomination.DIME) != 0  && count-- != 0)
                denominationList.add(Denomination.DIME);
        }

        if(amount/(Denomination.NICKEL.getVal()) > 0 && denominationService.getCount(Denomination.NICKEL) != 0){
            int count = amount/(Denomination.NICKEL.getVal());
            while(denominationService.getCount(Denomination.NICKEL) != 0 && count-- != 0)
                denominationList.add(Denomination.NICKEL);
        }

        if(amount/(Denomination.PENNY.getVal())> 0 && denominationService.getCount(Denomination.PENNY) != 0){
            int count = amount/(Denomination.PENNY.getVal());
            while(denominationService.getCount(Denomination.PENNY) != 0 && count-- != 0)
                denominationList.add(Denomination.PENNY);
        }

        if(amount > 0){
            throw new InsufficientAmountException();
        }

    }

}
