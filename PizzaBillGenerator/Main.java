package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Pizza basePizza = new Pizza(false);
//        //basePizza.getPizzaPrice();
//        basePizza.addExtraToppings();
//        basePizza.addExtraCheeese();
//        basePizza.takeAway();
//        basePizza.getBill();

        DeluxePizza dp = new DeluxePizza(false);
//       dp.addExtraCheeese();
//       dp.addExtraToppings();
        dp.takeAway();
        dp.getBill();

    }
}