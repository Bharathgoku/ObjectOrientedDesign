package ObjectOrientedDesign.OnlineShoppingSystem.services;

public interface NotificationService {

    void sendNotificationByEmail(String text, String email);

    void sendNotificationByPhone(String text, String phoneNo);

}
