package com.designpatterns.objectstructural.decorator.gk;

public class GarlicCheese extends PizzaDecorator {
	Pizza pizza ;
	
    public GarlicCheese(Pizza newPizza) {
        this.pizza = newPizza; 
    }
	public String bakePizza() {
        return pizza.bakePizza() + " with GarlicCheese topping added";
    }
}
