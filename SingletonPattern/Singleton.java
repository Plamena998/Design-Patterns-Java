public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        System.out.println("Singleton е създаден!");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Метод на Singleton");
    }
}