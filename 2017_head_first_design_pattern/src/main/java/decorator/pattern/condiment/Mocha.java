package decorator.pattern.condiment;

import decorator.pattern.startbuzz.Beverage;
import decorator.pattern.startbuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost()+1.3;
	}

}
