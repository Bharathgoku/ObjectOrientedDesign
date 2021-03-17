package ObjectOrientedDesign.FoodDeliveryApp.services.interfaces;

import ObjectOrientedDesign.FoodDeliveryApp.enums.OrderStatus;
import ObjectOrientedDesign.FoodDeliveryApp.entities.Order;
import java.util.List;

public interface OrderingService {

    Order placeOrder(Order order);

    Order cancelOrder(Order order);

    Order getOrder();

    OrderStatus getOrderStatus(Integer orderId);

    List<Order> orderList(Integer userId);

}
