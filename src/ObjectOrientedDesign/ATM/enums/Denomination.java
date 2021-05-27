package ObjectOrientedDesign.ATM.enums;

public enum Denomination {
    FIFTIES(50), HUNDREDS(100), TWO_HUNDREDS(200), FIVE_HUNDREDS(500), TWO_THOUSANDS(2000);

    private int value;

    Denomination(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
