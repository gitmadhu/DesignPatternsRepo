package com.designpatterns.objectstructural.decorator.gk;

public abstract class PizzaDecorator implements Pizza {
    Pizza pizza;
    public PizzaDecorator(Pizza newPizza) {
        this.pizza = newPizza;
    }
    @Override
    public String bakePizza() {
        return pizza.bakePizza();
    }
}