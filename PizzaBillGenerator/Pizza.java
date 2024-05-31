package org.example;

public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppings = 150;

    private  int backPack = 20;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAwayAdded = false;

    //Constructor

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

//    public void getPizzaPrice() {
//        System.out.println(this.price) ;
//    }

    public void addExtraCheeese() {
        isExtraCheeseAdded = true;
//        System.out.println("Extra cheese added");
        this.price += extraCheesePrice;


    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        //System.out.println("Extra Toppings ");
        this.price += extraToppings;

    }

    public void takeAway() {
        isTakeAwayAdded = true;
        //System.out.println("take away");
        this.price +=  backPack;

    }



    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " +this.basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "extra cheese : " +extraCheesePrice + "\n" ;
        }
        if (isExtraToppingsAdded) {
            bill += "extra toppings : " +extraToppings + "\n" ;
        }
        if (isTakeAwayAdded) {
            bill += "take away : " +backPack + "\n" ;
        }
        bill += "Bill : " +this.price +"\n" ;

        System.out.println(bill) ;
    }
}
