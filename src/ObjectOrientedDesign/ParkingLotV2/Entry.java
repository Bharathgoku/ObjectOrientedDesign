package ObjectOrientedDesign.ParkingLotV2;

import ObjectOrientedDesign.ParkingLot.ParkingLot;

public class Entry {

    private Integer entryId;
    private ParkingFloor parkingFloor;
    private static Integer counter = 1;

    public Entry() {
        setEntryId();
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public Ticket getTicket(String vehicleNumber, SpotType spotType){
        ParkingLotSystem parkingLotSystem = parkingFloor.getParkingLotSystem();
        return parkingLotSystem.getSpot(parkingFloor.getParkingFloorId(), spotType, vehicleNumber);
    }

    public void setEntryId() {
        this.entryId = counter;
        counter = counter + 1;
    }

    public Integer getEntryId() {
        return entryId;
    }
}
