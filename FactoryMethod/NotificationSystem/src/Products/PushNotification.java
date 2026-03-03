class PushNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH notification: " + message);
    }
}