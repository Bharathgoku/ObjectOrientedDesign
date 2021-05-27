package ObjectOrientedDesign.CarRentalService.entities;

import ObjectOrientedDesign.CarRentalService.LateFee;
import ObjectOrientedDesign.CarRentalService.TravelDetails;
import ObjectOrientedDesign.CarRentalService.enums.BookingStatus;
import java.util.List;

public class Booking {

    private Integer bookingId;
    private Integer memberId;
    private BookingStatus bookingStatus;
    private Double advance;
    private Double totalAmount;
    private TravelDetails travelDetails;
    private Integer vehicleId;
    private Integer travelledMiles;
    private LateFee lateFee;
    private List<Equipment> equipmentList;

}
