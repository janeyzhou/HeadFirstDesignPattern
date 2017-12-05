package factory.pattern.factorymethod.pizza;

public class NYCheesePizza extends Pizza {
	public NYCheesePizza(){
		name = "NY Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
		toppings.add("potato");
	}
	
	
}
