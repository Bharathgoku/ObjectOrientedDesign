package ObjectOrientedDesign.OnlineShoppingSystem.services;

import ObjectOrientedDesign.OnlineShoppingSystem.entities.Member;

public interface RegistrationService {

    Member registerCustomer(Integer guestId, String email, String password);

}
