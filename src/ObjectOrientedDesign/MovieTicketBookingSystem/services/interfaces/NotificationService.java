package ObjectOrientedDesign.MovieTicketBookingSystem.services.interfaces;

public interface NotificationService {

    void sendEmailNotification(String email);

    void sendSmsNotification(String phoneNumber);

}
