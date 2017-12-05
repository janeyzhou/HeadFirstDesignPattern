package factory.pattern.abstractfactory.pizza;

import factory.pattern.abstractfactory.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	
	
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory){
		name = "cheesepizza";
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public	void prepare() {
		System.out.println("prepare: " + name);
		dough = ingredientFactory.createDough();
		cheese = ingredientFactory.createCheese();
		System.out.println("dough type:  "+ dough.getDough());
		System.out.println("Cheese type: "+ cheese.getCheese());
	}

}
