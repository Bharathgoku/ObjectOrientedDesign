package ObjectOrientedDesign.BowlingAlley.entities;

import ObjectOrientedDesign.BowlingAlley.enums.Bonus;

public class Try {

    private Integer score;
    private Bonus bonus;

    public Try(Integer score) {
        this.score = score;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    public Integer getScore() {
        return score;
    }

    public Bonus getBonus() {
        return bonus;
    }
}
