package ObjectOrientedDesign.ParkingLotV2;

import ObjectOrientedDesign.ParkingLotV2.exceptions.NoSlotException;
import ObjectOrientedDesign.ParkingLotV2.exceptions.TicketInvalidException;
import ObjectOrientedDesign.ParkingLotV2.exceptions.TicketMismatchException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ParkingLotSystem {

    private Map<Integer, ParkingFloor> parkingFloorMap;
    private PaymentService paymentService;
    private Map<Integer, Ticket> ticketMap;

    public ParkingLotSystem(Map<Integer, ParkingFloor> parkingFloorMap) {
        this.ticketMap = new HashMap<>();
        this.parkingFloorMap = parkingFloorMap;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public Ticket getSpot(Integer floorNumber, SpotType spotType, String vehicleNumber) throws NoSlotException {
        ParkingFloor parkingFloor = parkingFloorMap.get(floorNumber);
        List<Spot> availableSpots = parkingFloor.getUnReservedSpots().get(spotType);
        if(availableSpots.size() == 0)
            throw new NoSlotException();

        Spot spot = availableSpots.get(availableSpots.size()-1);
        availableSpots.remove(availableSpots.size()-1);
        parkingFloor.getReservedSpots().add(spot);
        Ticket ticket = new Ticket(spot, vehicleNumber, LocalDateTime.now());
        ticketMap.put(ticket.getTicketId(), ticket);
        return ticket;
    }

    public boolean exit(Integer ticketId){
        Ticket ticket = ticketMap.get(ticketId);
        if(ticket == null){
            throw new TicketInvalidException();
        }
        Spot spot = ticket.getSpot();
        ParkingFloor parkingFloor = spot.getParkingFloor();
        List<Spot> unReservedSpots = parkingFloor.getUnReservedSpots().get(spot.getSpotType());
        unReservedSpots.add(spot);
        parkingFloor.getReservedSpots().remove(spot);
        return true;
    }

    public Ticket getTicket(Integer ticketId){
        Ticket ticket = ticketMap.get(ticketId);
        if(ticket == null)
            throw new TicketInvalidException();

        return ticket;
    }

    public void addParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloorMap.put(parkingFloor.getParkingFloorId(), parkingFloor);
    }

    public ParkingFloor getParkingFloor(Integer parkingFloorId){
        return this.parkingFloorMap.get(parkingFloorId);
    }
}
