package ObjectOrientedDesign.FoodDeliveryApp;

import ObjectOrientedDesign.FoodDeliveryApp.entities.Delivery;
import ObjectOrientedDesign.FoodDeliveryApp.entities.Item;
import ObjectOrientedDesign.FoodDeliveryApp.entities.Order;
import ObjectOrientedDesign.FoodDeliveryApp.entities.Restaurant;
import ObjectOrientedDesign.FoodDeliveryApp.entities.Transaction;
import ObjectOrientedDesign.FoodDeliveryApp.enums.CuisineType;
import ObjectOrientedDesign.FoodDeliveryApp.enums.PaymentType;
import ObjectOrientedDesign.FoodDeliveryApp.services.interfaces.PaymentService;
import ObjectOrientedDesign.FoodDeliveryApp.services.interfaces.RestaurantService;
import ObjectOrientedDesign.FoodDeliveryApp.services.interfaces.UserService;
import java.util.List;
import java.util.Map;

public class FoodDeliveryApp implements OwnerFoodDeliveryApp, CustomerFoodDeliveryApp, DeliveryBoyFoodDeliveryApp{


    private UserService userService;

    private PaymentService paymentService;

    private RestaurantService restaurantService;


    @Override
    public List<Item> getItemByMealType(CuisineType cuisineType) {
        return null;
    }

    @Override
    public Order placeOrder(Order order) {
        return null;
    }

    @Override
    public Order cancelOrder(Order order) {
        return null;
    }

    @Override
    public Transaction makePayment(Map<String, String> metadata, PaymentType paymentType) {
        return null;
    }

    @Override
    public List<Order> getAllOrders(Integer userId) {
        return null;
    }

    @Override
    public Order applyCoupon() {
        return null;
    }

    @Override
    public List<Restaurant> searchRestaurant(String s) {
        return null;
    }

    @Override
    public Order getOrder(Integer orderId) {
        return null;
    }

    @Override
    public List<Delivery> getDeliveries(Integer deliveryBoyId) {
        return null;
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return null;
    }

    @Override
    public void removeRestaurant(Restaurant restaurant) {

    }

    @Override
    public Restaurant updateMenu(Restaurant restaurant) {
        return null;
    }
}
