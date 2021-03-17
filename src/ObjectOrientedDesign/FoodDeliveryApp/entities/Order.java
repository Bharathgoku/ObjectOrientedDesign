package ObjectOrientedDesign.FoodDeliveryApp.entities;

import ObjectOrientedDesign.FoodDeliveryApp.enums.OrderStatus;
import java.util.List;

public class Order {

    private Integer orderId;

    private OrderStatus orderStatus;

    private Double orderPrice;

    private List<Item> itemList;

    private User user;

    private String deliveryAddress;

    private Restaurant restaurant;

}
