package ObjectOrientedDesign.OnlineShoppingSystem;

import ObjectOrientedDesign.OnlineShoppingSystem.entities.Address;
import ObjectOrientedDesign.OnlineShoppingSystem.enums.Category;
import ObjectOrientedDesign.OnlineShoppingSystem.entities.Order;
import ObjectOrientedDesign.OnlineShoppingSystem.entities.Product;
import ObjectOrientedDesign.OnlineShoppingSystem.entities.Transaction;
import ObjectOrientedDesign.OnlineShoppingSystem.services.OrderingService;
import ObjectOrientedDesign.OnlineShoppingSystem.services.PaymentService;
import ObjectOrientedDesign.OnlineShoppingSystem.services.SearchService;
import java.util.List;
import java.util.Map;

public class MemberSystemImpl implements MemberSystem, CustomerSystem{

    private SearchService searchService;

    private OrderingService orderingService;

    private PaymentService paymentService;

    @Override
    public List<Product> searchProductByName(String name) {
        return null;
    }

    @Override
    public List<Product> searchProductByCategory(Category category) {
        return null;
    }

    @Override
    public Product addProductToCart(Integer memberId, Product product) {
        return null;
    }

    @Override
    public Order checkOut(Integer memberId, Address address) {
        return null;
    }

    @Override
    public Transaction buyItems(Integer orderId, Map<String, String> metaData) {
        return null;
    }

    @Override
    public Order cancelOrder(Integer memberId, Integer orderId) {
        return null;
    }
}
