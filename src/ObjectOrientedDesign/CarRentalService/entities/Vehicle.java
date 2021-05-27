package ObjectOrientedDesign.CarRentalService.entities;

import ObjectOrientedDesign.CarRentalService.VehicleProfile;
import ObjectOrientedDesign.CarRentalService.enums.VehicleStatus;
import ObjectOrientedDesign.CarRentalService.enums.VehicleType;

public class Vehicle {

    private String barcodeNumber;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private VehicleStatus status;
    private Integer parkingStallNumber;
    private VehicleProfile vehicleProfile;

}
