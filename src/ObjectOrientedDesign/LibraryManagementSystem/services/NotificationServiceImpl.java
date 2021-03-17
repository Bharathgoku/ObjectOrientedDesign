package ObjectOrientedDesign.LibraryManagementSystem.services;

import ObjectOrientedDesign.LibraryManagementSystem.services.interfaces.BookingService;
import ObjectOrientedDesign.LibraryManagementSystem.services.interfaces.NotificationService;

public class NotificationServiceImpl implements NotificationService {

    private BookingService bookingService;

    @Override
    public void sendNotificationForAvailableBooks() {

    }

    @Override
    public void sendNotificationForDueDate() {

    }
}
