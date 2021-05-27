package ObjectOrientedDesign.ATM;

import ObjectOrientedDesign.ATM.states.ATMState;

public class ATMStateMachine {

    private ATMState idleState;
    private ATMState cardInserted;
    private ATMState pinEntered;
    private ATMState transactionEnquired;
    private ATMState currentState;
    private Card card;

    private CashDispenser cashDispenser;
    private Printer printer;
    private DepositSlot depositSlot;

    public ATMState getIdleState() {
        return idleState;
    }

    public ATMState getCardInserted() {
        return cardInserted;
    }

    public ATMState getPinEntered() {
        return pinEntered;
    }

    public ATMState getTransactionEnquired() {
        return transactionEnquired;
    }

    public ATMState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ATMState currentState) {
        this.currentState = currentState;
    }
}
