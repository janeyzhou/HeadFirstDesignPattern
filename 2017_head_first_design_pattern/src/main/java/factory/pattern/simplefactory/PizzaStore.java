package factory.pattern.simplefactory;

public class PizzaStore {
/*	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory){
		this.factory = factory;
	}
	*/
	public Pizza orderPizza(String type){
		Pizza pizza = SimplePizzaFactory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

}
