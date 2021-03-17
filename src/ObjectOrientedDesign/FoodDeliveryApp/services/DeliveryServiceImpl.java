package ObjectOrientedDesign.FoodDeliveryApp.services;

import ObjectOrientedDesign.FoodDeliveryApp.DataStore.DeliveryData;
import ObjectOrientedDesign.FoodDeliveryApp.services.interfaces.DeliveryService;
import ObjectOrientedDesign.FoodDeliveryApp.entities.Delivery;
import ObjectOrientedDesign.FoodDeliveryApp.entities.Order;
import java.util.List;

public class DeliveryServiceImpl implements DeliveryService {

    private DeliveryData deliveryData;

    @Override
    public Delivery startDelivery(Order order) {
        return null;
    }

    @Override
    public List<Delivery> getDeliveriesByDeliveryBoy(Integer deliveryBoyId) {
        return null;
    }

    @Override
    public Delivery getDelivery(Integer deliveryId) {
        return null;
    }

    @Override
    public Delivery cancelDelivery(Integer deliveryId) {
        return null;
    }
}
