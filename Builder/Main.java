public class Main {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza.PizzaBuilder("Голяма")
                .withDough("пълнозърнесто")
                .withSauce("BBQ")
                .addCheese()
                .addSalami()
                .build();

        myPizza.show();

        // Можем да направим и съвсем проста пица
        Pizza simplePizza = new Pizza.PizzaBuilder("Малка")
                .addCheese()
                .build();

        simplePizza.show();
    }
}