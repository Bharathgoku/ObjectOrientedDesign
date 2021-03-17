package ObjectOrientedDesign.Splitwise;

import java.util.List;

public abstract class Expense {

    private Integer expenseId;

    private User paidBy;
    private Double amount;

    private List<Split> splits;

    protected abstract boolean validate();

}
