package factory.pattern.factorymethod.pizza;

public class ChicagoCheesePizza extends Pizza{

	public ChicagoCheesePizza(){
		name = "Chicago Cheese Pizza";
		dough = "Extra Thin Crust Dough";
		sauce = "Tomato Sauce";
		
		toppings.add("Mozzarella Cheese");
	}
	
	public void cut(){
		System.out.println("cut the pizza into square slices");
	}

}
