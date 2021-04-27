package ObjectOrientedDesign.Splitwise.entities;

import ObjectOrientedDesign.Splitwise.entities.Split;
import ObjectOrientedDesign.Splitwise.entities.User;

public class ExactSplit extends Split {

    private Integer amount;

    public ExactSplit(User paidTo) {
        super(paidTo);
    }
}
