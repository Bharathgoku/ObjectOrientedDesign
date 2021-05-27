package ObjectOrientedDesign.ATM.states;

public class CardInsertedState implements ATMState{

    @Override
    public void insertATM(String accountNumber) {

    }

    @Override
    public void enteredPin(String pinNumber) {

    }

    @Override
    public void cancelTransaction() {

    }

    @Override
    public void removeCard() {

    }

    @Override
    public Double balanceEnquiry() {
        return null;
    }

    @Override
    public Double depositCash(Integer amount) {
        return null;
    }

    @Override
    public Double depositCheck() {
        return null;
    }

    @Override
    public Double withdrawCash(Integer amount) {
        return null;
    }

    @Override
    public Double transferFund(Integer amount, String beneficiaryAccount) {
        return null;
    }
}
