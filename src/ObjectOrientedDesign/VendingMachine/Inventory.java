package ObjectOrientedDesign.VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory {


  Map<Item, Integer> itemInventoryMap;

  public Inventory() {
  }

  {
    this.itemInventoryMap = new HashMap<>();
  }

  public Item getItem(Item item){
    removeItem(item);
    return item;
  }

  private void removeItem(Item item){
    itemInventoryMap.put(item, itemInventoryMap.get(item)-1);
  }

  public void addExistingItem(Item itempType, Integer quantity){
    // add the quantity to the  item;
  }

  public void addItem(Item item, Integer count){
    itemInventoryMap.put(item, count);
  }

}
