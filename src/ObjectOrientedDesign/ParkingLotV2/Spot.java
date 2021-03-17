package ObjectOrientedDesign.ParkingLotV2;

public class Spot {

    private SpotType spotType;
    private ParkingFloor parkingFloor;

    public Spot(SpotType spotType) {
        this.spotType = spotType;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }
}
