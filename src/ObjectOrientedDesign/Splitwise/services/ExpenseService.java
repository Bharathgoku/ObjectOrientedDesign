package ObjectOrientedDesign.Splitwise.services;

import ObjectOrientedDesign.Splitwise.entities.Expense;
import ObjectOrientedDesign.Splitwise.entities.Split;
import ObjectOrientedDesign.Splitwise.entities.User;
import ObjectOrientedDesign.Splitwise.enums.ExpenseType;
import java.util.List;

public interface ExpenseService {

    Expense createExpense(ExpenseType expenseType, User paidBy, List<Split> splits);

}
