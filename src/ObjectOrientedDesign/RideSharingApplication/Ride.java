package ObjectOrientedDesign.RideSharingApplication;

public class Ride {

  private Integer id;
  private Integer origin;
  private Integer destination;
  private Integer noOfSeats;

  private RideStatus rideStatus;

  public RideStatus getRideStatus() {
    return rideStatus;
  }

  public void setRideStatus(RideStatus rideStatus) {
    this.rideStatus = rideStatus;
  }

  public Ride(Integer origin, Integer destination, Integer noOfSeats) {
    this.origin = origin;
    this.destination = destination;
    this.noOfSeats = noOfSeats;
    this.rideStatus = RideStatus.CREATED;
  }

  public void setOrigin(Integer origin) {
    this.origin = origin;
  }

  public void setDestination(Integer destination) {
    this.destination = destination;
  }

  public void setNoOfSeats(Integer noOfSeats) {
    this.noOfSeats = noOfSeats;
  }

  public Integer calculateRideAmount(){
    return null;
  }

}
