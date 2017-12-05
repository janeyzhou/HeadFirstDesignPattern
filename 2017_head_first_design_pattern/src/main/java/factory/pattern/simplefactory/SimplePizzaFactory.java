package factory.pattern.simplefactory;

public class SimplePizzaFactory {
	
	public static Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		} else if( type.equals("pepperroni")){
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")){
			pizza = new ClamPizza();
		}
		
		return pizza;
	}

}
