public static class PizzaBuilder {
    private String size;
    private String dough = "класическо";
    private String sauce = "доматен";
    private List<String> toppings = new ArrayList<>();

    public PizzaBuilder(String size) {
        this.size = size;
    }

    public PizzaBuilder withDough(String dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder withSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder addCheese() {
        this.toppings.add("Моцарела");
        return this;
    }

    public PizzaBuilder addSalami() {
        this.toppings.add("Салам");
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }
}
}