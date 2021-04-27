package ObjectOrientedDesign.Splitwise.entities;

import java.util.List;

public abstract class Expense {

    private Integer expenseId;
    private String title;
    private User paidBy;
    private Double amount;
    private String currency;

    private List<Split> splits;

    protected abstract boolean validate();

}
