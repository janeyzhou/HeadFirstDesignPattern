package factory.pattern.abstractfactory.pizzastore;

import factory.pattern.abstractfactory.factory.NYPizzaIngredientFactory;
import factory.pattern.abstractfactory.factory.PizzaIngredientFactory;
import factory.pattern.abstractfactory.pizza.CheesePizza;
import factory.pattern.abstractfactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if(item.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			System.out.println("Order NY " + pizza.getName() );
		}
		return pizza;
	}

}
