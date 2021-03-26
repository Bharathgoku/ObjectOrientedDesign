package ObjectOrientedDesign.BowlingAlley.enums;

public enum Bonus {
    SPARE(5), STRIKE(10);

    private int bonusValue;

    Bonus(int bonusValue) {
        this.bonusValue = bonusValue;
    }

    public Integer getBonusValue(){
        return this.bonusValue;
    }
}
