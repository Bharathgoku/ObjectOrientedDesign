package ObjectOrientedDesign.RideSharingApplication;

import java.util.List;

public class Driver extends Person {

  List<Ride> rideList;

  public Driver(String name) {
    super(name);
  }
}
