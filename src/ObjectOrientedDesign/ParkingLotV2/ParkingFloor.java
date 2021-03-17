package ObjectOrientedDesign.ParkingLotV2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ParkingFloor {

    private Integer parkingFloorId;
    private Map<SpotType, List<Spot>> unReservedSpots;
    private Set<Spot> reservedSpots;

    private Integer floorNo;

    private Map<Integer, Exit> exitMap;

    private Map<Integer, Entry> entryMap;

    private ParkingLotSystem parkingLotSystem;

    private static Integer counter = 1;

    public ParkingFloor(
        Map<SpotType, List<Spot>> unReservedSpots, Integer floorNo,
        Map<Integer, Exit> exitList, Map<Integer, Entry> entryList) {
        this.unReservedSpots = unReservedSpots;
        this.floorNo = floorNo;
        this.exitMap = exitList;
        this.entryMap = entryList;
        setParkingFloorId();
    }

    public Map<SpotType, List<Spot>> getUnReservedSpots() {
        return unReservedSpots;
    }

    public void setUnReservedSpots(
        HashMap<SpotType, List<Spot>> unReservedSpots) {
        this.unReservedSpots = unReservedSpots;
    }

    public Set<Spot> getReservedSpots() {
        return reservedSpots;
    }

    public void setReservedSpots(Set<Spot> reservedSpots) {
        this.reservedSpots = reservedSpots;
    }


    public ParkingLotSystem getParkingLotSystem() {
        return parkingLotSystem;
    }

    public void setParkingLotSystem(ParkingLotSystem parkingLotSystem) {
        this.parkingLotSystem = parkingLotSystem;
    }

    public Integer getParkingFloorId() {
        return parkingFloorId;
    }

    private void setParkingFloorId() {
        this.parkingFloorId = counter;
        counter = counter+1;
    }

    public Entry getEntry(Integer entryId){
        return this.entryMap.get(entryId);
    }

    public Exit getExit(Integer exitId){
        return this.exitMap.get(exitId);
    }
}
