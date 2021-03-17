package ObjectOrientedDesign.VendingMachine;

import java.util.List;

public class VendingMachineImpl implements VendingMachine{

  private Inventory inventory;

  private Item selectedItem;

  private List<Denomination> denominationList;

  private Account account;

  public VendingMachineImpl(Inventory inventory) {
    this.inventory = inventory;
    this.account = new Account(this);
  }

  public Integer selectItemAndGetPrice(Item item){
    this.selectedItem = item;
    return this.selectedItem.getPrice();
  }

//  public Pair<Item, Integer> insertMoneyAndSelectItemAndGet(Integer price, ItemType itemType){
//    this.selectedItem = itemType;
//    Integer actualPrice = getPrice(itemType);
//    System.out.println("Price inserted - " + price.toString());
//    Pair<Item, Integer> result = new Pair<Item, Integer>(null, 0);
//    if(price >= actualPrice){
//      Integer remaingAmount = account.refundRemainingAmount();
//      result = new Pair<Item, Integer>(inventory.getItem(itemType), remaingAmount);
//    }else if(price < actualPrice){
//      System.out.println("Price inserted is not sufficient for selected item");
//    }
//    return result;
//  }

  public boolean collectMoneyAndValidate(List<Denomination> denominationList, Item item){
    Integer actualPrice = item.getPrice();
    Integer collectedAmount = account.calculateAmountFromDenominations(denominationList);
    System.out.println("Price inserted - " + collectedAmount.toString());
    if(collectedAmount < actualPrice){
      this.selectedItem = null;
      return false;
    }
    this.denominationList = denominationList;
    return true;
  }

  public Item getItem(){
    return inventory.getItem(this.selectedItem);
  }

  public List<Denomination> remainingAmount(){
    return account.refundRemainingAmount();
  }

  public Item getSelectedItem() {
    return selectedItem;
  }

  public List<Denomination> getDenominationList() {
    return denominationList;
  }
}
