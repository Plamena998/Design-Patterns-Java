import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle initialCircle = new Circle();
        initialCircle.setX(10);
        initialCircle.setY(10);
        initialCircle.setColor("Pink");
        initialCircle.setRadius(50);

        System.out.println("Оригинал: " + initialCircle);

        List<Shape> shapeCopies = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Circle copy = (Circle) initialCircle.clone();

            copy.setX(100 + (i * 50));
            copy.setY(100 + (i * 50));

            shapeCopies.add(copy);
        }

        System.out.println("\n--- Копия ---");
        for (Shape shape : shapeCopies) {
            System.out.println(shape);
        }

        System.out.println("\nЕднакви обекти ли са? " + (initialCircle == shapeCopies.get(0))); // false
    }
}