package com.designpatterns.objectstructural.decorator.gk;

public class GarlicCheese extends PizzaDecorator {

	public GarlicCheese(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
	}
	
	public String bakePizza() {
        return pizza.bakePizza() + " with GarlicCheese topping added";
    }
}
