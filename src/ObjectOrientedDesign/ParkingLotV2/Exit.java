package ObjectOrientedDesign.ParkingLotV2;

import java.util.HashMap;
import java.util.Map;

public class Exit {
    private Integer exitId;
    private ParkingFloor parkingFloor;
    private static Integer counter = 1;

    public Exit() {
        setExitId();
    }

    public Double getAmount(Integer ticketId){
        PaymentService paymentService = parkingFloor.getParkingLotSystem().getPaymentService();
        return paymentService.calculateAmount(ticketId);
    }

    public boolean makePayment(Integer ticketId, PaymentType paymentType, Map<String, String> paymentMetaData){
        PaymentService paymentService = parkingFloor.getParkingLotSystem().getPaymentService();
        Transaction transaction = paymentService.makePayment(paymentType, paymentMetaData);

        return TransactionStatus.COMPLETED.equals(transaction.getTransactionStatus());
    }

    public boolean markExit(Integer ticketId){
        ParkingLotSystem parkingLotSystem = parkingFloor.getParkingLotSystem();
        return parkingLotSystem.exit(ticketId);
    }

    private void setExitId(){
        this.exitId = counter;
        counter = counter + 1;
    }

    public Integer getExitId() {
        return exitId;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
