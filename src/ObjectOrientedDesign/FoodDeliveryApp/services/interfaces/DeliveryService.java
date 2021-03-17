package ObjectOrientedDesign.FoodDeliveryApp.services.interfaces;

import ObjectOrientedDesign.FoodDeliveryApp.entities.Delivery;
import ObjectOrientedDesign.FoodDeliveryApp.entities.Order;
import java.util.List;

public interface DeliveryService {

    Delivery startDelivery(Order order);

    List<Delivery> getDeliveriesByDeliveryBoy(Integer deliveryBoyId);

    Delivery getDelivery(Integer deliveryId);

    Delivery cancelDelivery(Integer deliveryId);

}
