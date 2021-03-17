package ObjectOrientedDesign.LibraryManagementSystem.services.interfaces;

import ObjectOrientedDesign.LibraryManagementSystem.entities.BookCheckout;
import ObjectOrientedDesign.LibraryManagementSystem.entities.Fine;

public interface FineService {

    Fine getFine(BookCheckout bookCheckout);

    Fine collectFine(Fine fine);

}
