package decorator.pattern.condiment;

import decorator.pattern.startbuzz.Beverage;
import decorator.pattern.startbuzz.CondimentDecorator;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + 1.2;
	}

}
