package ObjectOrientedDesign.VendingMachineV2.enums;

public enum Denomination {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    private int val;
    Denomination(int value){
        this.val = value;
    }

    public int getVal(){
        return this.val;
    }
}
