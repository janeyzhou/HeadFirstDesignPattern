package factory.pattern.abstractfactory.pizzastore;

import factory.pattern.abstractfactory.pizza.Pizza;

public abstract class PizzaStore {
	public void orderPizza(String item){
		Pizza pizza = createPizza(item);
		pizza.prepare();
		pizza.bake();
		
	}
	
	public abstract Pizza createPizza(String item);

}
