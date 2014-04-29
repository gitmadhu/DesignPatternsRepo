package com.designpatterns.objectstructural.decorator.gk;

public class SpicyVegPizza extends PizzaDecorator {
	
	Pizza pizza ;
	
    public SpicyVegPizza(Pizza newPizza) {
        this.pizza = newPizza; 
    }

	public String bakePizza() {
	        return pizza.bakePizza() + " with SpicyVeg topping added";
	    }
}
