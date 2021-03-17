package ObjectOrientedDesign.FoodDeliveryApp;

import ObjectOrientedDesign.FoodDeliveryApp.entities.Item;
import ObjectOrientedDesign.FoodDeliveryApp.entities.Order;
import ObjectOrientedDesign.FoodDeliveryApp.entities.Restaurant;
import ObjectOrientedDesign.FoodDeliveryApp.entities.Transaction;
import ObjectOrientedDesign.FoodDeliveryApp.enums.CuisineType;
import ObjectOrientedDesign.FoodDeliveryApp.enums.PaymentType;
import java.util.List;
import java.util.Map;

public interface CustomerFoodDeliveryApp {


    List<Item> getItemByMealType(CuisineType cuisineType);

    Order placeOrder(Order order);

    Order cancelOrder(Order order);

    Transaction makePayment(Map<String, String > metadata, PaymentType paymentType);

    List<Order> getAllOrders(Integer userId);

    Order applyCoupon();

    List<Restaurant> searchRestaurant(String s);

    Order getOrder(Integer orderId);

}
