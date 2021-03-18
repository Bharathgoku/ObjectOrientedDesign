package ObjectOrientedDesign.MovieTicketBookingSystem.services;

public interface NotificationService {

    void sendEmailNotification(String email);

    void sendSmsNotification(String phoneNumber);

}
