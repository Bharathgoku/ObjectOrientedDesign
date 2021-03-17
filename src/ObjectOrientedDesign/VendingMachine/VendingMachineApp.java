package ObjectOrientedDesign.VendingMachine;

import java.util.Arrays;
import java.util.List;

public class VendingMachineApp {

  public static void main(String[] args){

  // todo : add exceptions

    Inventory inventory = new Inventory();

    inventory.addItem(Item.A, 10);
    inventory.addItem(Item.B, 20);
    inventory.addItem(Item.C, 30);

    VendingMachine vendingMachine = new VendingMachineImpl(inventory);

    // Step - 1
    vendingMachine.selectItemAndGetPrice(Item.A);

    List<Denomination> denominationList = Arrays
        .asList(Denomination.ONE, Denomination.TWO,
            Denomination.TWO, Denomination.FIVE);

    // Step - 2
    if(vendingMachine.collectMoneyAndValidate(denominationList, Item.A)){

      // Step - 3
      Item item = vendingMachine.getItem();

      // Step - 4
      List<Denomination> remainingAmount = vendingMachine.remainingAmount();

      System.out.println("Please take the item - " + item.getName());

      System.out.println("Please take the remaining Amount - " + remainingAmount);

    }else{
      System.out.println("Price inserted is not sufficient for selected item");
    }

  }

}
