package ObjectOrientedDesign.FoodDeliveryApp.entities;

import ObjectOrientedDesign.FoodDeliveryApp.enums.TransactionStatus;

public class Transaction {

    private Integer transactionId;

    private TransactionStatus transactionStatus;

    private Order order;

}
