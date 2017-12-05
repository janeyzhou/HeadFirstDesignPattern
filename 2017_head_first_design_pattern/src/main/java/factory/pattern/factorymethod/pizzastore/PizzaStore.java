package factory.pattern.factorymethod.pizzastore;

import factory.pattern.factorymethod.pizza.Pizza;

public abstract class PizzaStore {
	
	public final void orderPizza(String type){
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		
		pizza.bake();
		
		pizza.cut();
		
		pizza.box();
	}
	
	public abstract Pizza createPizza(String type);

}
