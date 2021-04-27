package ObjectOrientedDesign.Splitwise;

import ObjectOrientedDesign.Splitwise.entities.Expense;
import ObjectOrientedDesign.Splitwise.entities.Split;
import ObjectOrientedDesign.Splitwise.entities.User;
import ObjectOrientedDesign.Splitwise.enums.ExpenseType;
import ObjectOrientedDesign.Splitwise.services.BalanceSheetService;
import ObjectOrientedDesign.Splitwise.services.ExpenseService;
import ObjectOrientedDesign.Splitwise.services.UserService;
import java.util.List;

public class SplitWise {

    private UserService userService;
    private ExpenseService expenseService;
    private BalanceSheetService balanceSheetService;

    public SplitWise() {
    }

    public User addUser(String name, String phoneNumber){
        return userService.addUser(name, phoneNumber);
    }

    public Expense addExpense(ExpenseType expenseType, User paidBy, List<Split> splits){
        return expenseService.createExpense(expenseType, paidBy, splits);
    }

    public List<String> showBalances(){
        return null;
    }

    public void settleBalance(User paidBy, User paidTo){

    }

}
