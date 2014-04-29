package com.designpatterns.objectstructural.decorator.gk;

public class PizzaClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p = new ChickenTikkaPizza(new Pizza());
		System.out.println(p.bakePizza());
		
		Pizza p1 = new SpicyVegPizza(new Pizza());
		System.out.println(p1.bakePizza());
		
		Pizza p2 = new GarlicCheese(p);
		System.out.println(p2.bakePizza());
	}

}
