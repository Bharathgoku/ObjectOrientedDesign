package ObjectOrientedDesign.ParkingLotV2;

import java.time.LocalDateTime;

public class Ticket {

    private Integer ticketId;
    private Spot spot;
    private String vehicleNumber;
    private LocalDateTime entryDateTime;
    private LocalDateTime exitDateTime;

    private static Integer counter = 1;

    public Ticket(Spot spot, String vehicleNumber, LocalDateTime entryDateTime) {
        this.spot = spot;
        this.vehicleNumber = vehicleNumber;
        this.entryDateTime = entryDateTime;
        setTicketId();
    }

    private void setTicketId() {
        this.ticketId = counter;
        counter = counter+1;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

}
