abstract class NotificationCreator {

    // Factory Method
    public abstract Notification createNotification();

    // Business logic
    public void notifyUser(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}