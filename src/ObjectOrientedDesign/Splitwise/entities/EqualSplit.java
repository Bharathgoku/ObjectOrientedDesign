package ObjectOrientedDesign.Splitwise.entities;

import ObjectOrientedDesign.Splitwise.entities.Split;
import ObjectOrientedDesign.Splitwise.entities.User;

public class EqualSplit extends Split {

    public EqualSplit(User paidTo) {
        super(paidTo);
    }
}
