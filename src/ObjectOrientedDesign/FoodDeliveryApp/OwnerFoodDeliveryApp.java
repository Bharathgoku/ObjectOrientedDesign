package ObjectOrientedDesign.FoodDeliveryApp;

import ObjectOrientedDesign.FoodDeliveryApp.entities.Restaurant;

public interface OwnerFoodDeliveryApp {

    Restaurant addRestaurant(Restaurant restaurant);

    void removeRestaurant(Restaurant restaurant);

    Restaurant updateMenu(Restaurant restaurant);

}
