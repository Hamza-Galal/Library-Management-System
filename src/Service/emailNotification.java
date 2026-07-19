package Service;
public class emailNotification implements NotificationService {
    public void sendNotification(String message){
        System.out.println(" Email Notification: " + message);
    }

}
