package ObjectOrientedDesign.CarRentalService;

import ObjectOrientedDesign.CarRentalService.entities.Booking;
import ObjectOrientedDesign.CarRentalService.entities.Vehicle;
import ObjectOrientedDesign.CarRentalService.enums.VehicleType;
import java.util.List;

public interface UserSystem {

    List<Vehicle> searchCarByTypeAndLocation(Location location, VehicleType vehicleType);

    Booking bookAVehicle(Integer vehicleId, Integer memberId, TravelDetails travelDetails);

    void cancelBooking(Integer bookingId, Integer memberId);

    Booking getBookingDetails(Integer bookingId, Integer memberId);

    List<Booking> showBookings(Integer memberId);

    Vehicle readBarCode();

    Booking addEquipmentToBooking(Integer equipmentId, Integer bookingId);

}
