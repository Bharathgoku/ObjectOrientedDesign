package ObjectOrientedDesign.LibraryManagementSystem;

import ObjectOrientedDesign.LibraryManagementSystem.services.interfaces.NotificationService;

public class Scheduler implements Runnable{

    private NotificationService notificationService;

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(10000);
                notificationService.sendNotificationForAvailableBooks();
                notificationService.sendNotificationForDueDate();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
