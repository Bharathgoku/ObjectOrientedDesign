package ObjectOrientedDesign.OnlineShoppingSystem;


import ObjectOrientedDesign.OnlineShoppingSystem.entities.Address;
import ObjectOrientedDesign.OnlineShoppingSystem.entities.Order;
import ObjectOrientedDesign.OnlineShoppingSystem.entities.Product;
import ObjectOrientedDesign.OnlineShoppingSystem.entities.Transaction;
import java.util.Map;

public interface MemberSystem {

    Product addProductToCart(Integer memberId, Product product);

    Order checkOut(Integer memberId, Address address); // return orderId

    Transaction buyItems(Integer orderId, Map<String, String> metaData);

    Order cancelOrder(Integer memberId, Integer orderId);

}
