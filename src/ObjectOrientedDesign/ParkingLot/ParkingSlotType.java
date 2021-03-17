package ObjectOrientedDesign.ParkingLot;

public enum ParkingSlotType {

  MOTORCYCLE_SLOT(10), CAR_SLOT(20), VAN_SLOT(30), TRUCK_SLOT(50);

  int price;

  ParkingSlotType(int price) {
    this.price = price;
  }

  public Integer getSlotPricePerHr(){
    return this.price;
  }
}
