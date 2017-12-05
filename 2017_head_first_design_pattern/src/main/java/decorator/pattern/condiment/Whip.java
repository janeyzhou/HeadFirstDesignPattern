package decorator.pattern.condiment;

import decorator.pattern.startbuzz.Beverage;
import decorator.pattern.startbuzz.CondimentDecorator;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + 1.2;
	}

}
