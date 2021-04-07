package ObjectOrientedDesign.OnlineShoppingSystem.services;

import ObjectOrientedDesign.OnlineShoppingSystem.entities.Tracking;

public interface OrderTrackingService {

    Tracking trackOrder(Integer orderId);

}
