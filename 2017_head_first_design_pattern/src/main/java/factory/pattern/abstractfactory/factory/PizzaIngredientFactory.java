package factory.pattern.abstractfactory.factory;

import factory.pattern.abstractfactory.source.Cheese;
import factory.pattern.abstractfactory.source.Dough;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Cheese createCheese();
	
	

}
