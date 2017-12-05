package factory.pattern.abstractfactory.factory;

import factory.pattern.abstractfactory.source.Cheese;
import factory.pattern.abstractfactory.source.Dough;
import factory.pattern.abstractfactory.source.ReggianoCheese;
import factory.pattern.abstractfactory.source.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
		
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

}
