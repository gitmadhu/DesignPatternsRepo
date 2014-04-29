package com.designpatterns.objectstructural.decorator.gk;

public class ChickenTikkaPizza extends PizzaDecorator {
	Pizza pizza ;
    public ChickenTikkaPizza(Pizza newPizza) {
        this.pizza = newPizza; 
    }
    public String bakePizza() {
        return pizza.bakePizza() + " with Chicken topping added";
    }
}
