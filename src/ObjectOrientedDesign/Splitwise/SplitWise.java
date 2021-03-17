package ObjectOrientedDesign.Splitwise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitWise {

    Map<Integer, User> userMap;
    Map<Integer, Expense> expenseMap;
    Map<Integer, Map<Integer, Double>> balanceSheet;

    public SplitWise(Map<Integer, User> userMap,
        Map<Integer, Expense> expenseMap,
        Map<Integer, Map<Integer, Double>> balanceSheet) {
        this.userMap = userMap;
        this.expenseMap = expenseMap;
        this.balanceSheet = balanceSheet;
    }

    public User addUser(){
        return null;
    }

    public Expense addExpense(){
        return null;
    }

    public List<String> showBalances(){
        return null;
    }

}
