package ObjectOrientedDesign.FoodDeliveryApp.entities;

import ObjectOrientedDesign.FoodDeliveryApp.entities.Item;
import ObjectOrientedDesign.FoodDeliveryApp.entities.Owner;
import java.util.Map;

public class Restaurant {

    private String name;

    private String address;

    private String city;

    Map<String, Item> menu;

    private Owner owner;

}
