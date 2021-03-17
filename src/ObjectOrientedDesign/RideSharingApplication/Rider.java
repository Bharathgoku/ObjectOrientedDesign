package ObjectOrientedDesign.RideSharingApplication;

import java.util.List;

public class Rider extends Person {

  List<Ride> rideList;

  private Ride currentRide;

  public Rider(String name) {
    super(name);
  }

  public void createRide(Integer origin, Integer destination, Integer noOfSeats){

    Ride ride = new Ride(origin, destination, noOfSeats);
    this.currentRide = ride;
  }
  public void updateRide(Integer origin, Integer destination, Integer noOfSeats){
    currentRide.setDestination(destination);
    currentRide.setNoOfSeats(noOfSeats);
    currentRide.setOrigin(origin);
  }
  public void withdrawRide(){
    this.currentRide.setRideStatus(RideStatus.WITHDRAWN);
    rideList.add(this.currentRide);
    this.currentRide = null;
  }
  public Integer closeRide(){
    // add the calculations
    this.currentRide.setRideStatus(RideStatus.COMPLETED);
    rideList.add(this.currentRide);
    Integer totalAmount = this.currentRide.calculateRideAmount();
    this.currentRide = null;
    return totalAmount;
  }

}
