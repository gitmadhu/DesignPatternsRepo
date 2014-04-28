package com.designpatterns.objectstructural.decorator.gk;

public class SpicyVegPizza extends PizzaDecorator {
	
	 public SpicyVegPizza(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
	}

	public String bakePizza() {
	        return pizza.bakePizza() + " with SpicyVeg topping added";
	    }
}
