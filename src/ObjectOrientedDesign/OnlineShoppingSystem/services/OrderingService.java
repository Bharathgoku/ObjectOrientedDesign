package ObjectOrientedDesign.OnlineShoppingSystem.services;

import ObjectOrientedDesign.OnlineShoppingSystem.entities.Address;
import ObjectOrientedDesign.OnlineShoppingSystem.entities.Member;
import ObjectOrientedDesign.OnlineShoppingSystem.entities.Order;

public interface OrderingService {

    Order placeOrder(Address address, Member member);

    void cancelOrder(Integer orderId);

}
