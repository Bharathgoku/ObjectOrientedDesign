package ObjectOrientedDesign.ATM;

public interface UserAtmSystem {

    Double balanceInquiry(); // return the amount in the account

    Double depositCash(); // opens the deposit slot and closes after some time

    Double depositCheck(); // opens the deposit slot and closes after some time

    Double withdrawMoney(Integer amount); // check the amount in account and opens dispense slot

    Double transferAmount(Integer amount, String accountNumber); // checks for the fund in account and transfer amount to account



}
