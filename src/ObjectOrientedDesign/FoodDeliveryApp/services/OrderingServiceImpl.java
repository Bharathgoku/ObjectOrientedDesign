package ObjectOrientedDesign.FoodDeliveryApp.services;

import ObjectOrientedDesign.FoodDeliveryApp.DataStore.OrderData;
import ObjectOrientedDesign.FoodDeliveryApp.enums.OrderStatus;
import ObjectOrientedDesign.FoodDeliveryApp.services.interfaces.OrderingService;
import ObjectOrientedDesign.FoodDeliveryApp.entities.Order;
import java.util.List;

public class OrderingServiceImpl implements OrderingService {

    private OrderData orderData;

    @Override
    public Order placeOrder(Order order) {
        return null;
    }

    @Override
    public Order cancelOrder(Order order) {
        return null;
    }

    @Override
    public Order getOrder() {
        return null;
    }

    @Override
    public OrderStatus getOrderStatus(Integer orderId) {
        return null;
    }

    @Override
    public List<Order> orderList(Integer userId) {
        return null;
    }
}
