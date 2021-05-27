package ObjectOrientedDesign.ATM.states;

public interface ATMState {

    void insertATM(String accountNumber);
    void enteredPin(String pinNumber);
    void cancelTransaction();
    void removeCard();
    Double balanceEnquiry();
    Double depositCash(Integer amount);
    Double depositCheck();
    Double withdrawCash(Integer amount);
    Double transferFund(Integer amount, String beneficiaryAccount);

}
