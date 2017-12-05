package factory.pattern.factorymethod.pizzastore;

import factory.pattern.factorymethod.pizza.ChicagoCheesePizza;
import factory.pattern.factorymethod.pizza.NYCheesePizza;
import factory.pattern.factorymethod.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
	private Pizza pizza =null;

	
	public Pizza createPizza(String type) {
		
		if(type.equals("nycheese")){
			pizza = new NYCheesePizza();
		} else if( type.equals("Chicago")){
			pizza = new ChicagoCheesePizza();
		}
		
		return pizza;
	}

}
