package ObjectOrientedDesign.Splitwise.entities;

import ObjectOrientedDesign.Splitwise.entities.Split;
import ObjectOrientedDesign.Splitwise.entities.User;

public class PercentSplit extends Split {
    private Double percent;

    public PercentSplit(User paidTo) {
        super(paidTo);
    }
}
