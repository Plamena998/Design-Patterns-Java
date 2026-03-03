public class Main {
    public static void main(String[] args) {

        NotificationCreator creator;

        creator = new EmailCreator();
        creator.notifyUser("Hello via Email!");

        creator = new SmsCreator();
        creator.notifyUser("Hello via SMS!");

        creator = new PushCreator();
        creator.notifyUser("Hello via Push!");
    }
}