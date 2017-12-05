package factory.pattern.abstractfactory.factory;

import factory.pattern.abstractfactory.source.Cheese;
import factory.pattern.abstractfactory.source.Dough;
import factory.pattern.abstractfactory.source.MozzarelaCheese;
import factory.pattern.abstractfactory.source.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Cheese createCheese() {
		return new MozzarelaCheese();
	}

}
