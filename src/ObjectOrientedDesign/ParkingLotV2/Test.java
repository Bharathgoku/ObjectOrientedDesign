package ObjectOrientedDesign.ParkingLotV2;

import ObjectOrientedDesign.ParkingLot.ParkingLot;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args){
        // initialise the parking lot system
        ParkingLotSystem parkingLotSystem = initialize();

        // make an entry
        Entry entry1 = parkingLotSystem.getParkingFloor(1).getEntry(1);
        Ticket ticket = entry1.getTicket("123", SpotType.MOTORCYCLE); // get the spot in the ticket

        // make an exit along with payment
        Exit exit1 = parkingLotSystem.getParkingFloor(1).getExit(1);
        Double amount = exit1.getAmount(ticket.getTicketId());

        Map<String, String> paymentMetaData = new HashMap<>();

        if(!exit1.makePayment(ticket.getTicketId(), PaymentType.CARD, paymentMetaData)){
            System.out.println("Payment Not successful");
        }

        if(!exit1.markExit(ticket.getTicketId())){
            System.out.println("Some error");
        }

        System.out.println("successful exit");

    }

    private static ParkingLotSystem initialize(){
        Spot spot11 = new Spot(SpotType.COMPACT);
        Spot spot12 = new Spot(SpotType.HANDICAPPED);
        Spot spot13 = new Spot(SpotType.MOTORCYCLE);
        Spot spot14 = new Spot(SpotType.LARGE);
        Map<SpotType, List<Spot>> unReservedSpots1 = new HashMap<>();
        unReservedSpots1.put(SpotType.COMPACT, Arrays.asList(spot11));
        unReservedSpots1.put(SpotType.HANDICAPPED, Arrays.asList(spot12));
        unReservedSpots1.put(SpotType.MOTORCYCLE, Arrays.asList(spot13));
        unReservedSpots1.put(SpotType.LARGE, Arrays.asList(spot14));

        Spot spot21 = new Spot(SpotType.COMPACT);
        Spot spot22 = new Spot(SpotType.HANDICAPPED);
        Spot spot23 = new Spot(SpotType.MOTORCYCLE);
        Spot spot24 = new Spot(SpotType.LARGE);
        Map<SpotType, List<Spot>> unReservedSpots2 = new HashMap<>();
        unReservedSpots2.put(SpotType.COMPACT, Arrays.asList(spot21));
        unReservedSpots2.put(SpotType.HANDICAPPED, Arrays.asList(spot22));
        unReservedSpots2.put(SpotType.MOTORCYCLE, Arrays.asList(spot23));
        unReservedSpots2.put(SpotType.LARGE, Arrays.asList(spot24));

        Spot spot31 = new Spot(SpotType.COMPACT);
        Spot spot32 = new Spot(SpotType.HANDICAPPED);
        Spot spot33 = new Spot(SpotType.MOTORCYCLE);
        Spot spot34 = new Spot(SpotType.LARGE);
        Map<SpotType, List<Spot>> unReservedSpots3 = new HashMap<>();
        unReservedSpots3.put(SpotType.COMPACT, Arrays.asList(spot31));
        unReservedSpots3.put(SpotType.HANDICAPPED, Arrays.asList(spot32));
        unReservedSpots3.put(SpotType.MOTORCYCLE, Arrays.asList(spot33));
        unReservedSpots3.put(SpotType.LARGE, Arrays.asList(spot34));

        Entry entry1 = new Entry();
        HashMap<Integer, Entry> entryMap1 = new HashMap<>();
        entryMap1.put(entry1.getEntryId(), entry1);
        Entry entry2 = new Entry();
        HashMap<Integer, Entry> entryMap2 = new HashMap<>();
        entryMap2.put(entry2.getEntryId(), entry2);
        Entry entry3 = new Entry();
        HashMap<Integer, Entry> entryMap3 = new HashMap<>();
        entryMap3.put(entry3.getEntryId(), entry3);

        Exit exit1 = new Exit();
        HashMap<Integer, Exit> exitMap1 = new HashMap<>();
        exitMap1.put(exit1.getExitId(), exit1);
        Exit exit2 = new Exit();
        HashMap<Integer, Exit> exitMap2 = new HashMap<>();
        exitMap2.put(exit2.getExitId(), exit2);
        Exit exit3 = new Exit();
        HashMap<Integer, Exit> exitMap3 = new HashMap<>();
        exitMap3.put(exit3.getExitId(), exit3);

        ParkingFloor parkingFloor1 = new ParkingFloor(unReservedSpots1, 1, exitMap1, entryMap1);
        ParkingFloor parkingFloor2 = new ParkingFloor(unReservedSpots2, 2, exitMap2, entryMap2);
        ParkingFloor parkingFloor3 = new ParkingFloor(unReservedSpots3, 3, exitMap3, entryMap3);

        entry1.setParkingFloor(parkingFloor1);
        entry2.setParkingFloor(parkingFloor2);
        entry3.setParkingFloor(parkingFloor3);

        exit1.setParkingFloor(parkingFloor1);
        exit2.setParkingFloor(parkingFloor2);
        exit3.setParkingFloor(parkingFloor3);

        Map<Integer, ParkingFloor> parkingFloorMap = new HashMap<>();
        parkingFloorMap.put(parkingFloor1.getParkingFloorId(), parkingFloor1);
        parkingFloorMap.put(parkingFloor2.getParkingFloorId(), parkingFloor2);
        parkingFloorMap.put(parkingFloor3.getParkingFloorId(), parkingFloor3);

        ParkingLotSystem parkingLotSystem = new ParkingLotSystem(parkingFloorMap);
        parkingFloor1.setParkingLotSystem(parkingLotSystem);
        parkingFloor2.setParkingLotSystem(parkingLotSystem);
        parkingFloor3.setParkingLotSystem(parkingLotSystem);

        return parkingLotSystem;
    }

}
