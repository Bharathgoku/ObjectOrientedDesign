package ObjectOrientedDesign.FoodDeliveryApp.services.interfaces;

import ObjectOrientedDesign.FoodDeliveryApp.entities.User;

public interface UserService {

    User addUser(User user);

    void removeUser(User user);

    User updateUser(User user);

    User getUser(Integer userId);

}
