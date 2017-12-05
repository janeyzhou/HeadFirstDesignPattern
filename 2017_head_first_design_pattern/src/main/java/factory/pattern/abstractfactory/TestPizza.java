package factory.pattern.abstractfactory;

import factory.pattern.abstractfactory.pizzastore.NYPizzaStore;
import factory.pattern.abstractfactory.pizzastore.PizzaStore;

public class TestPizza {

	public static void main(String[] args) {
		PizzaStore nypizzastore = new NYPizzaStore();
		nypizzastore.orderPizza("cheese");

	}

}
