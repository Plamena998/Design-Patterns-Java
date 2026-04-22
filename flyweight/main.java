import java.util.HashMap;

class Shape {
    private String color; // Споделена част (Intrinsic)
    public Shape(String color) { this.color = color; }
    public void draw(int x, int y) { System.out.println("Drawing " + color + " circle at " + x + ":" + y); }
}

class ShapeFactory {
    private static final HashMap<String, Shape> shapes = new HashMap<>();

    public static Shape getCircle(String color) {
        if (!shapes.containsKey(color)) {
            shapes.put(color, new Shape(color));
            System.out.println("Creating new shape of color: " + color);
        }
        return shapes.get(color);
    }
}

// Клиент
public class Main {
    public static void main(String[] args) {
        Shape red1 = ShapeFactory.getCircle("Red");
        red1.draw(10, 10);

        Shape red2 = ShapeFactory.getCircle("Red"); // Ще върне същия обект като red1
        red2.draw(20, 20);
    }
}