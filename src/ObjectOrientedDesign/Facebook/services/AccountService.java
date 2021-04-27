package ObjectOrientedDesign.Facebook.services;

import ObjectOrientedDesign.Facebook.entities.Account;

public interface AccountService {

    Account createAccount(String email, String password);

}
