package org.example;

public class DeluxePizza extends Pizza{
    public DeluxePizza(boolean veg) {
        super(veg);
        super.addExtraCheeese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheeese() {

    }

    @Override
    public void addExtraToppings() {

    }
}
