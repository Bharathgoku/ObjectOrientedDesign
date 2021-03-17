package ObjectOrientedDesign.ParkingLot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotImpl implements ParkingLot{

  Map<String, ParkingFloor> parkingFloorMap;

  private Banker banker;

  private Scanner scanner;

  Map<String, Ticket> customerTicketMap;

  private String customerName;

  public ParkingLotImpl() {
    this.parkingFloorMap = new HashMap<>();
    this.banker = new Banker();
  }

  public void addParkingFloor(){

  }

  public Ticket giveTicket(ParkingSlotType parkingSlotType){
    return null;
  }

  public Integer scanTicket(Ticket ticket){
    return scanner.getPrice(ticket);
  }

  public void collectCashAndTakeAction(List<Denomination> collectedCash){
    // check the cash and add it to the bank
    // refund if any amount is there to refund
  }

  public void openExit(){
    // open the door
  }
}
