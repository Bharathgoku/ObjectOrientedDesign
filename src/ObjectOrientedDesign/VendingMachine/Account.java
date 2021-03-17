package ObjectOrientedDesign.VendingMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Account {

  Map<Denomination, Integer> bank;

  VendingMachine vendingMachine;

  public Account(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  {
    this.bank = new HashMap<>();
    addDenomination(Denomination.ONE, 10);
    addDenomination(Denomination.TWO, 20);
    addDenomination(Denomination.FIVE, 30);
    addDenomination(Denomination.TEN, 100);
  }

  public List<Denomination> refundRemainingAmount(){
    addDenominations(vendingMachine.getDenominationList());
    Integer collectedAmount = calculateAmountFromDenominations(vendingMachine.getDenominationList());
    Integer actualAmount = vendingMachine.selectItemAndGetPrice(vendingMachine.getSelectedItem());
    Integer refundAmount = collectedAmount - actualAmount;

    return getDenominations(refundAmount);
  }

  public void addDenomination(Denomination denomination, Integer count){
    bank.put(denomination, bank.getOrDefault(denomination, 0) + count);
  }

  public Integer calculateAmountFromDenominations(List<Denomination> denominationList){
    Integer amount = 0;
    for(Denomination denomination : denominationList){
      amount += denomination.getValue();
    }
    return amount;
  }

  public void addDenominations(List<Denomination> denominationList){
    for(Denomination denomination : denominationList){
      addDenomination(denomination, 1);
    }
  }

  public void removedenomination(Denomination denomination){
    bank.put(denomination, bank.get(denomination) -1);
  }

  private List<Denomination> getDenominations(Integer amount){

    // we can Dynamic Programming to get the Denominations;


    List<Denomination> denominationList = new ArrayList<>();
    Denomination[] denominations = Denomination.values();
    Arrays.sort(denominations, (a, b) -> b.getValue() - a.getValue());
    for(Denomination denomination: denominations){
      if(amount < denomination.getValue())
        continue;
      denominationList.add(denomination);
      removedenomination(denomination);
      amount -= denomination.getValue();
    }
    return denominationList;
  }
}
