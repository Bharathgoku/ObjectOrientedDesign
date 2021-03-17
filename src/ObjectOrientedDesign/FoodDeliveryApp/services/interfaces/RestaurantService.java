package ObjectOrientedDesign.FoodDeliveryApp.services.interfaces;

import ObjectOrientedDesign.FoodDeliveryApp.entities.Restaurant;

public interface RestaurantService {

    Restaurant addRestaurant(Restaurant restaurant);

    void removeRestaurant(Restaurant restaurant);

    Restaurant updateMenu(Restaurant restaurant);

}
