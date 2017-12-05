package factory.pattern.simplefactory;

public class TestPizza {

	public static void main(String[] args) {
		PizzaStore ps = new PizzaStore();
		ps.orderPizza("cheese");
	}

}
