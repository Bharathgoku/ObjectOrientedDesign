package ObjectOrientedDesign.LibraryManagementSystem.services;

import ObjectOrientedDesign.LibraryManagementSystem.entities.BookCheckout;
import ObjectOrientedDesign.LibraryManagementSystem.entities.Fine;
import ObjectOrientedDesign.LibraryManagementSystem.enums.FineStatus;
import ObjectOrientedDesign.LibraryManagementSystem.services.interfaces.FineService;

public class FineServiceImpl implements FineService {

    @Override
    public Fine getFine(BookCheckout bookCheckout) {
        Double amount = 100.0;
        Fine fine = new Fine(amount, FineStatus.UNPAID, bookCheckout);
        return fine;
    }

    @Override
    public Fine collectFine(Fine fine) {
        fine.setFineStatus(FineStatus.PAID);
        return fine;
    }
}
