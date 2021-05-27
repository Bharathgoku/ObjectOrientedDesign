package ObjectOrientedDesign.CarRentalService.services;

import ObjectOrientedDesign.CarRentalService.TravelDetails;
import ObjectOrientedDesign.CarRentalService.entities.Booking;
import ObjectOrientedDesign.CarRentalService.entities.Vehicle;

public interface BookingService {

    Booking bookVehicle(Integer vehicleId, Double advanceAmount, Integer memberId, TravelDetails travelDetails);

    void cancelBooking(Integer bookingId, Integer memberId);

}
