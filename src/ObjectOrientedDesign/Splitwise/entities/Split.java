package ObjectOrientedDesign.Splitwise.entities;

public class Split {

    private User paidTo;

    private Integer amount;

    private Integer expenseId;

    public Split(User paidTo) {
        this.paidTo = paidTo;
    }
}
