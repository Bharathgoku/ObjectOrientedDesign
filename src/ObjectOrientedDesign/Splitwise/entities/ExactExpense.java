package ObjectOrientedDesign.Splitwise.entities;

public class ExactExpense extends Expense {

    @Override
    protected boolean validate() {
        return false;
    }
}
