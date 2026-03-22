import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String size;
    private final String dough;
    private final String sauce;
    private final List<String> toppings;

    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.toppings = builder.toppings;
    }

    public void show() {
        System.out.println("Пица [" + size + "], Тесто: " + dough +
                ", Сос: " + sauce + ", Добавки: " + toppings);
    }