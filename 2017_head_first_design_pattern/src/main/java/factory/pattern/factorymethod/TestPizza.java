package factory.pattern.factorymethod;

import factory.pattern.factorymethod.pizzastore.ChicagoPizzaStore;
import factory.pattern.factorymethod.pizzastore.NYPizzaStore;
import factory.pattern.factorymethod.pizzastore.PizzaStore;

public class TestPizza {
	public static void main(String[] args){
		PizzaStore nypizzastore = new NYPizzaStore();
		nypizzastore.orderPizza("nycheese");
		
		PizzaStore chicogopizzastore = new ChicagoPizzaStore();
		chicogopizzastore.orderPizza("Chicagocheese");
		
	}

}
